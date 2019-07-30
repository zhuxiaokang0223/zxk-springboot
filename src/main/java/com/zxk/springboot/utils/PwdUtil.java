package com.zxk.springboot.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.StringUtils;

/**
 * @Description: 密码工具类
 * @Author: zhuxiaokang
 * @CreateDate: 2019/7/5 11:09
 * @Version: 1.0
 */
public class PwdUtil {

    private static BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();

    /** 密码加解密算法前缀 */
    private static final String ENCODE_PWD_PREFIX = "{bcrypt}";

    /**
     * 加密
     * @param laws 明文密码
     * @return
     */
    public static String encode(String laws) {
        return ENCODE_PWD_PREFIX + bcrypt.encode(laws);
    }

    /**
     * 校验密码
     * @param laws 明文密码
     * @param ciphertext  密文密码
     * @return
     */
    public static boolean matches(String laws, String ciphertext) {
        return bcrypt.matches(laws, ciphertext.replace(ENCODE_PWD_PREFIX, ""));
    }

    public static void main(String[] args) {
        String pwd = "123456";

        String encodeStr = encode(pwd);

        System.err.println("加密串：" + encodeStr);

        System.err.println("校验：" + matches(pwd, encodeStr));
    }

}
