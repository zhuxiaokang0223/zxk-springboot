package com.zxk.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Describe: @SpringBootApplication注解包含以下注解
 *           @EnableAutoConfiguration
 *           @ComponentScan
 *           @Configuration
 *
 * @author : ZhuXiaokang
 * @mail : xiaokang.zhu@pactera.com
 * @date : 2018/8/28 17:12
 * Attention:
 * Modify:
 */
@RestController
@SpringBootApplication
public class StartApplication2 {

    @RequestMapping("/2")
    public String home(){
        return "Hello Word 2!";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(StartApplication2.class, args);
    }
}
