package com.demo.service.auth;

import com.demo.pojo.user.User;

public interface AuthService {

    boolean loginCheck(User user);

    boolean regiseter(User user);
}
