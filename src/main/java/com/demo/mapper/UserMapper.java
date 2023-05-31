package com.demo.mapper;

import com.demo.pojo.user.User;

import java.util.List;

public interface UserMapper {
    List<User> findUserList();

    void insertUser(User user);

    User findUserByEmail(String email);
}
