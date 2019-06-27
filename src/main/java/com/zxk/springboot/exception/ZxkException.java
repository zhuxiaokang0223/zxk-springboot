package com.zxk.springboot.exception;

/**
 * @Description: 自定义异常
 * @Author: zhuxiaokang
 * @CreateDate: 2019/6/27 16:33
 * @Version: 1.0
 */
public class ZxkException extends RuntimeException{

    private static final long serialVersionUID = 7200280906662911877L;

    private String msg;
    private int code = 500;

    public ZxkException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public ZxkException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public ZxkException(int code, String msg) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public ZxkException(int code, String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
