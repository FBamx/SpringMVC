package com.demo.controller;

import com.demo.pojo.result.LoginResult;
import com.demo.pojo.user.User;
import com.demo.service.auth.AuthServiceImpl;
import com.demo.utils.JWT;
import com.demo.utils.response.ResponseCode;
import com.demo.utils.response.ResponseData;
import com.demo.utils.response.ResponseDataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthServiceImpl authService;

    @PostMapping("/login")
    @ResponseBody
    public ResponseData login(@RequestBody User user) {
        if (authService.loginCheck(user)) {
            String token = JWT.sign(user, 550000);
            return ResponseDataUtils.buildSuccess(ResponseCode.SUCCESS, "login success", new LoginResult(1, token));
        }
        return ResponseDataUtils.buildFailed(ResponseCode.LOGINFAILED, "login failed");
    }

    @GetMapping("/hello")
    @ResponseBody
    public ResponseData sayHello() {
        return ResponseDataUtils.buildFailed(201, "login failed");
    }

    @PostMapping("/register")
    @ResponseBody
    public ResponseData register(@RequestBody User user) {
       if (!authService.regiseter(user)) {
           return ResponseDataUtils.buildFailed(ResponseCode.REGISTERLAILED, "user already exist");
       }
       return ResponseDataUtils.buildSuccess(ResponseCode.SUCCESS, "register success");
    }

}
