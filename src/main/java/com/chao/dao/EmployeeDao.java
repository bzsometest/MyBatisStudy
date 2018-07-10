package com.chao.dao;

import com.chao.bean.EmployeeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeDao {
    /**
     * 查询所有
     *
     * @return
     */
    public List<EmployeeEntity> selectAll();

    /**
     * 查询单一
     *
     * @param id
     * @return
     */
    public EmployeeEntity selectOne(String id);

    /**
     * 新增
     */
    public void insert(EmployeeEntity employee);

    /**
     * 修改
     */
    public void update(EmployeeEntity employee);

    /**
     * 删除
     */
    public void delete(String id);

    /**
     * 多条件查询
     *
     * @param id
     * @param name
     * @return
     */
    public List<EmployeeEntity> queryList(@Param("id") String id, @Param("name") String name);

    /**
     * 多条件查询
     *
     * @param map
     * @return
     */
    public List<EmployeeEntity> queryList2(Map map);

    /**
     * 动态sql查询
     *
     * @param employee
     * @return
     */
    public List<EmployeeEntity> queryByIf(EmployeeEntity employee);

    /**
     * 多条件sql查询
     *
     * @param employee
     * @return
     */
    public List<EmployeeEntity> queryByChoose(EmployeeEntity employee);

    /**
     * 多条件sql查询  byTrim
     *
     * @param employee
     * @return
     */
    public List<EmployeeEntity> queryByTrim(EmployeeEntity employee);

    /**
     * 多条件sql查询  byWhere
     *
     * @param employee
     * @return
     */
    public List<EmployeeEntity> queryByWhere(EmployeeEntity employee);

    /**
     * 批量操作
     *
     * @param list
     * @return
     */
    public Integer deleteByList(List<EmployeeDao> list);

    /**
     * 批量操作
     *
     * @param array
     * @return
     */
    public Integer deleteByArray(String[] array);
}
