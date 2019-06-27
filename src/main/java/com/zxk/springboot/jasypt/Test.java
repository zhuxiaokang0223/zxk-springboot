package com.zxk.springboot.jasypt;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @Description:
 * @Author: zhuxiaokang
 * @CreateDate: 2019/6/27 11:56
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //加密所需的salt(盐)
        textEncryptor.setPassword("tmg");
        //要加密的数据（数据库的用户名或密码）
        String username = textEncryptor.encrypt("root");
        String password = textEncryptor.encrypt("root");
        System.out.println("username:"+username);
        System.out.println("password:"+password);
    }
}
