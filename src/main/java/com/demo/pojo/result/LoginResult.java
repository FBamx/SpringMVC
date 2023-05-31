package com.demo.pojo.result;

public class LoginResult {
    private int loginID;
    private String token;

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

}
