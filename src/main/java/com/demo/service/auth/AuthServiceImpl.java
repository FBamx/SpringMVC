package com.demo.service.auth;

import com.demo.mapper.UserMapper;
import com.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements AuthService{

    @Autowired
    private UserMapper userMapper;

    public List<User> findUserList() {
        return userMapper.findUserList();
    }
}
