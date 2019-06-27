package com.zxk.springboot.control;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zxk.springboot.StartApplication1;
import com.zxk.springboot.base.ApiResponse;
import com.zxk.springboot.exception.ZxkException;
import com.zxk.springboot.model.MyTable;
import com.zxk.springboot.model.dao.MyTableMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: zhuxiaokang
 * @CreateDate: 2019/6/26 17:17
 * @Version: 1.0
 */
@RestController
public class MyTableController {

    private static final Logger log = LoggerFactory.getLogger(StartApplication1.class);

    @Autowired
    private MyTableMapper myTableMapper;

    @RequestMapping("/")
    public String home(int pageNum, int pageSize){
        log.info("aaaaaaaaaaaa");
        log.debug("bbbbbbbbbb");
        log.error("ccccccccccc");
        log.warn("ddddddddddddd");
        Page page = PageHelper.startPage(pageNum, pageSize);
        List<MyTable> myTable = myTableMapper.selectAll();
        myTable.stream().forEach(myTable1 -> System.err.println(myTable1.getId()));
        log.info("total:{}", page.getTotal());


        List<MyTable> myTable2 = myTableMapper.selectAll();
        myTable2.stream().forEach(myTable3 -> System.err.println("第二个查询不带分页:"+myTable3.getId()));
        log.info("第二个查询不带分页:total:{}", page.getTotal());
        return "Hello Word!";
    }

    @GetMapping("/add")
    public ApiResponse add(){
        MyTable myTable = new MyTable();
        myTable.setId(3);
        myTable.setSignDay(333333);
        myTable.setStudentid("11111111111111111111111111111111");
        myTableMapper.insertSelective(myTable);

//        throw new ZxkException(300, "插入失败");

//
//        MyTable myTable1 = new MyTable();
//        myTable1.setId(4);
//        myTable1.setSignDay(333333);
//        myTable1.setStudentid("111111111111111111111111111111112");
//        myTableMapper.insertSelective(myTable);

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        return new ApiResponse().setData(arr);
    }

}
