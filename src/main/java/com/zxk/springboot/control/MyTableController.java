package com.zxk.springboot.control;

import com.zxk.springboot.StartApplication1;
import com.zxk.springboot.model.MyTable;
import com.zxk.springboot.model.dao.MyTableMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String home(){
        log.info("aaaaaaaaaaaa");
        log.debug("bbbbbbbbbb");
        log.error("ccccccccccc");
        log.warn("ddddddddddddd");
        MyTable myTable = myTableMapper.selectByPrimaryKey(1);
        return "Hello Word!";
    }

}
