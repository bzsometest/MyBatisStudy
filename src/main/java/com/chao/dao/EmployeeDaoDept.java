package com.chao.dao;

import com.chao.bean.EmployeeEntity;

import java.util.List;

public interface EmployeeDaoDept {
    //多表联合查询
    public List<EmployeeEntity> selectAll3();

    public List<EmployeeEntity> selectAll4();

    //分步查询方法
    public List<EmployeeEntity> selectStep(String id);
}
