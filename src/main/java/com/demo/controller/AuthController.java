package com.demo.controller;

import com.alibaba.fastjson.JSON;
import com.demo.pojo.LoginResult;
import com.demo.pojo.User;
import com.demo.utils.JWT;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@Controller
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {
    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody String body) {
        User user = JSON.parseObject(body, User.class);
        String jwt = JWT.sign(user, 55000);
        System.out.println(jwt);
        LoginResult lr = new LoginResult(200, "login success");
        return JSON.toJSONString(lr);
    }

    @GetMapping("/test")
    @ResponseBody
    public User test() {
        return new User("er@qq.com", "1234");
    }

}
