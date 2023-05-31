package com.demo.service.auth;

import com.demo.mapper.UserMapper;
import com.demo.pojo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{

    @Autowired
    private UserMapper userMapper;

    public boolean loginCheck(User user) {
        User dbUser = userMapper.findUserByEmail(user.getEmail());
        return dbUser != null && dbUser.getPassword().equals(user.getPassword());
    }

    public boolean regiseter(User user) {
        User dbUser = userMapper.findUserByEmail(user.getEmail());
        if (dbUser != null) {
            return false;
        }
        userMapper.insertUser(user);
        return true;
    }


}
