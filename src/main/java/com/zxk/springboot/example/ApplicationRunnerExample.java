package com.zxk.springboot.example;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Describe: Application应用程序启动后执行
 *          ApplicationRunner  或  CommandLineRunner
 *
 * @author : ZhuXiaokang
 * @mail : xiaokang.zhu@pactera.com
 * @date : 2018/9/11 9:43
 * Attention:
 * Modify:
 */
@Component
public class ApplicationRunnerExample implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        System.err.println("Application启动后执行: ApplicationRunner");
    }
}
