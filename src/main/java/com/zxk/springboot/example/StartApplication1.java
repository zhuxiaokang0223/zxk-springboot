package com.zxk.springboot.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RestController
@EnableAutoConfiguration
public class StartApplication1 {

    private static final Logger log = LoggerFactory.getLogger(StartApplication1.class);

    @RequestMapping("/")
    public String home(){
        log.info("aaaaaaaaaaaa");
        log.debug("bbbbbbbbbb");
        log.error("ccccccccccc");
        log.warn("ddddddddddddd");
        return "Hello Word!";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(StartApplication1.class, args);
    }

}
