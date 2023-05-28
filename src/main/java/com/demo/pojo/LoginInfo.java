package com.demo.pojo;

public class LoginInfo {
    private String token;
    private Integer userID;

    public LoginInfo(String token, Integer userID) {
        this.token = token;
        this.userID = userID;
    }

    public LoginInfo() {
    }

    @Override
    public String toString() {
        return "LoginInfo{" +
                "token='" + token + '\'' +
                ", userID=" + userID +
                '}';
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getToken() {
        return token;
    }

    public Integer getUserID() {
        return userID;
    }
}
