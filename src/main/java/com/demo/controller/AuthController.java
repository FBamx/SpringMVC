package com.demo.controller;

import com.alibaba.fastjson.JSON;
import com.demo.pojo.LoginResult;
import com.demo.pojo.User;
import com.demo.utils.JWT;
import com.demo.utils.response.ResponseCode;
import com.demo.utils.response.ResponseData;
import com.demo.utils.response.ResponseDataUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {
    @PostMapping("/loginWithFastjson")
    @ResponseBody
    public String login(@RequestBody String body) {
        User user = JSON.parseObject(body, User.class);
        String jwt = JWT.sign(user, 55000);
        System.out.println(jwt);
        LoginResult lr = new LoginResult(200, "login success");
        return JSON.toJSONString(lr);
    }

    @PostMapping("/login")
    @ResponseBody
    public ResponseData login(@RequestBody User user) {
        int loginID = 1;
        String token = JWT.sign(user, 550000);
        return ResponseDataUtils.buildSuccess(ResponseCode.SUCCESS, "login success",  new LoginResult(loginID, token));
    }

}
