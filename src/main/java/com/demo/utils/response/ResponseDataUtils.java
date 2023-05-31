package com.demo.utils.response;

public class ResponseDataUtils {

    public static <T> ResponseData buildSuccess(T data) {
       return new ResponseData<T>(ResponseCode.SUCCESS, "ok", data);
    }

    public static <T> ResponseData buildSuccess(int code, String message, T data) {
        return new ResponseData<T>(code, message, data);
    }

    public static <T> ResponseData buildSuccess(int code, String message) {
        return new ResponseData<T>(code, message);
    }
    public static <T> ResponseData buildFailed(int code, String message, T data) {
        return new ResponseData<T>(code, message, data);
    }

    public static <T> ResponseData buildFailed(int code, String message) {
        return new ResponseData<T>(code, message);
    }
}
