package com.demo.service.auth;

import com.demo.pojo.User;

import java.util.List;

public interface AuthService {
    List<User> findUserList();
}
