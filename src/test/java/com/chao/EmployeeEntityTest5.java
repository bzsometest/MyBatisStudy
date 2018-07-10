package com.chao;

import com.chao.bean.EmployeeEntity;
import com.chao.dao.EmployeeDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 多条件查询
 */
public class EmployeeEntityTest5 {

    @Test
    public void wan() throws IOException {
        String resource = "sqlMapConfig.xml";           // 定位核心配置文件

        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);    // 创建 SqlSessionFactory
        //true代表自动提交，false需要使用commit，默认false
        SqlSession sqlSession = sqlSessionFactory.openSession(true);    // 获取到 SqlSession

        //创建接口对象，这个是session对象通过动态代理自动帮我们创建
        EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);

        Map map = new HashMap();
        map.put("id","1");
        map.put("name","chao");
        List<EmployeeEntity> employees = employeeDao.queryList2(map);
        System.out.println("is null:"+(employees==null));
        for (EmployeeEntity employeeA : employees) {
            System.out.println(employeeA.getName());
        }

    }
}