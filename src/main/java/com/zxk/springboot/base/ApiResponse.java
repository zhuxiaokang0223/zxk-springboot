package com.zxk.springboot.base;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * @Description: 统一响应类
 * @Author: zhuxiaokang
 * @CreateDate: 2019/6/27 16:50
 * @Version: 1.0
 */
public class ApiResponse<T>  {

    private static final int SUCCESS_CODE = 200;
    private static final String SUCCESS_MSG = "SUCCESS";

    private int code;
    private String msg;
    private T data;

    public ApiResponse() {
        this.code = SUCCESS_CODE;
        this.msg = SUCCESS_MSG;
    }

    public ApiResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ApiResponse setData(T data){
        this.data = data;
        return this;
    }

    public int getCode() {
        return code;
    }

    public ApiResponse setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ApiResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

}
