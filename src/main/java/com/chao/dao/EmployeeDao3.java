package com.chao.dao;

import com.chao.bean.EmployeeEntity;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmployeeDao3 {
    /**
     * 查询所有
     *
     * @return
     */
    @Select("select * from employee")
    public List<EmployeeEntity> selectAll();

    /**
     * 查询单一
     *
     * @param id
     * @return
     */
    @Select("SELECT * FROM employee where id =#{id}")
    public EmployeeEntity selectOne(String id);
}
