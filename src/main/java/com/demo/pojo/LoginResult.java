package com.demo.pojo;

public class LoginResult {
    private int loginID;

    public LoginResult() {
    }

    public LoginResult(int loginID, String token) {
        this.loginID = loginID;
        this.token = token;
    }

    public void setLoginID(int loginID) {
        this.loginID = loginID;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getLoginID() {
        return loginID;
    }

    public String getToken() {
        return token;
    }

    private String token;
}
