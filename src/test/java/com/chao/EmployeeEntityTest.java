package com.chao;

import com.chao.bean.EmployeeEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class EmployeeEntityTest {

    @Test
    public void wan() {
        String resource = "sqlMapConfig.xml";           // 定位核心配置文件
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);    // 创建 SqlSessionFactory
            SqlSession sqlSession = sqlSessionFactory.openSession();    // 获取到 SqlSession

            // 调用 mapper 中的方法：命名空间 + id
            EmployeeEntity employee = sqlSession.selectOne("com/chao/EmployeeEntity.selectOne");

            System.out.println(employee.getName());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}