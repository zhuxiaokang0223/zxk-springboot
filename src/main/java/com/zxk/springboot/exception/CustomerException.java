package com.zxk.springboot.exception;

import com.zxk.springboot.base.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:  统一异常拦截处理
 * @Author: zhuxiaokang
 * @CreateDate: 2019/6/27 16:20
 * @Version: 1.0
 */
@ControllerAdvice
public class CustomerException {

    private static final Logger log = LoggerFactory.getLogger(CustomerException.class);

    @ExceptionHandler(value = ZxkException.class)
    @ResponseBody
    public ApiResponse handleZxkException(ZxkException ex) {
        log.error("exception error: {}", ex);
        return new ApiResponse(ex.getCode(), ex.getMsg());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ApiResponse handleException(Exception ex) {
        log.error("exception error: {}", ex);
        return new ApiResponse(500, "服务器内部错误");
    }

}
