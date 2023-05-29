package com.demo.test;

import com.demo.mapper.UserMapper;
import com.demo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/SpringMVC.xml")
public class Test_SpringMybatis {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindUserList() {
        List<User> userList = userMapper.findUserList();
        System.out.println(userList);

        User user = new User(3, "495745954@qq.com", "lichubin");
        userMapper.insertUser(user);
    }

}
