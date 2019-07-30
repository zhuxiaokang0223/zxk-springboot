package com.zxk.springboot.utils;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @Description: Jasypt加密(用于生成配置文件属性值加密串)
 * @Author: zhuxiaokang
 * @CreateDate: 2019/7/30 11:07
 * @Version: 1.0
 */
public class JasyptUtil {

    /**
     * 加密
     * @param salt 盐
     * @param str  待加密字符串
     * @return
     */
    public static String encryption(String salt, String str) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(salt);
        String encryStr = textEncryptor.encrypt(str);
        return encryStr;
    }

    public static void main(String[] args) {
        String salt = "aa";
        String str = "root_sx";
        String encryStr = encryption(salt, str);
        System.err.println(encryStr);
    }
}
