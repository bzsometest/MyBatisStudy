package com.chao;

import com.chao.bean.EmployeeEntity;
import com.chao.dao.EmployeeDaoDept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 分步查询
 */
public class EmployeeDeptTest2 {

    @Test
    public void wan() throws IOException {
        String resource = "sqlMapConfig.xml";           // 定位核心配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);    // 创建 SqlSessionFactory
        SqlSession sqlSession = sqlSessionFactory.openSession(true);    // 获取到 SqlSession

        // 调用 mapper 中的方法：命名空间 + id
        EmployeeDaoDept mapper = sqlSession.getMapper(EmployeeDaoDept.class);

        EmployeeEntity list = mapper.selectStep("2");
        System.out.println(list);

    }
}