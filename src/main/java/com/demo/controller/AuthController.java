package com.demo.controller;

import com.alibaba.fastjson.JSON;
import com.demo.pojo.LoginResult;
import com.demo.pojo.User;
import com.demo.service.auth.AuthService;
import com.demo.service.auth.AuthServiceImpl;
import com.demo.utils.JWT;
import com.demo.utils.response.ResponseCode;
import com.demo.utils.response.ResponseData;
import com.demo.utils.response.ResponseDataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
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
        System.out.println(authService.findUserList());
        int loginID = 1;
        String token = JWT.sign(user, 550000);
        return ResponseDataUtils.buildSuccess(ResponseCode.SUCCESS, "login success",  new LoginResult(loginID, token));
    }

}
