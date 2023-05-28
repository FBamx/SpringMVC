package com.demo.pojo;

import org.springframework.stereotype.Component;

public class LoginResult {
    private int code;
    private String message;

    public LoginResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public LoginResult() {
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
