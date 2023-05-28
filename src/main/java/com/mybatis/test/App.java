package com.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
/**/
public class App {
    public static void main(String[] args) {
//        指定配置文件
        String resource = "MybatisConfig.xml";
        InputStream inputStream = null;
//        读取配置文件
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            Student stu = sqlSession.selectOne("MyMapper.selectUser", 1);
            System.out.println(stu);
        } finally {
            sqlSession.close();
        }
    }
}
