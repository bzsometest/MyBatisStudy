package com.chao.dao;

import com.chao.bean.Department;

public interface DepartmentDao {
    //根据id查询部门信息
    public Department getById(String id);
}
