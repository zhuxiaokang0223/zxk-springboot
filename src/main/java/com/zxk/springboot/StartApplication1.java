package com.zxk.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * Describe: 第一个简单示例
 *   最简单的例子， POM中只需要引入：
 *   1. spring-boot-starter-parent
 *   2. spring-boot-starter-web
 * @author : ZhuXiaokang
 * @mail : xiaokang.zhu@pactera.com
 * @date : 2018/8/24 13:54
 * Attention:
 * Modify:
 */
@SpringBootApplication
public class StartApplication1 {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(StartApplication1.class, args);
    }
}
