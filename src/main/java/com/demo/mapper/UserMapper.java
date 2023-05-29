package com.demo.mapper;

import com.demo.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

public interface UserMapper {
    List<User> findUserList();

    void insertUser(User user);
}
