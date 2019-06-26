package com.zxk.springboot.model.dao;


import com.zxk.springboot.model.MyTable;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface MyTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MyTable record);

    int insertSelective(MyTable record);

    MyTable selectByPrimaryKey(Integer id);

    List<MyTable> selectAll();

    int updateByPrimaryKeySelective(MyTable record);

    int updateByPrimaryKey(MyTable record);
}