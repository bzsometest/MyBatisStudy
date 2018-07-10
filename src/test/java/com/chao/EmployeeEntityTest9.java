package com.chao;

import com.chao.dao.EmployeeDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 批量删除
 */
public class EmployeeEntityTest9 {

    @Test
    public void wan() throws IOException {
        String resource = "sqlMapConfig.xml";           // 定位核心配置文件

        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);    // 创建 SqlSessionFactory
        //true代表自动提交，false需要使用commit，默认false
        SqlSession sqlSession = sqlSessionFactory.openSession(true);    // 获取到 SqlSession
        EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);

    /*    List list = new ArrayList();
        list.add("1");
        list.add("2");

        int x = employeeDao.deleteByList(list);*/

        String[] strs = {"1", "2"};
        int y = employeeDao.deleteByArray(strs);

        System.out.println("delete:" + y);
    }
}