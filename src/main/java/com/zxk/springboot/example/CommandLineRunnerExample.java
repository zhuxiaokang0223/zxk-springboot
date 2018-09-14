package com.zxk.springboot.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Describe: Application应用程序启动后执行
 *           ApplicationRunner  或  CommandLineRunner
 *
 *           关于配置文件：
 *               默认使用application.properties
 *               若要使用自定义的配置文件，则需要在环境变量中配置spring.config.name=配置文件名， 或配置spring.config.location指定配置文件位置；
 *               也可以使用 @PropertySource 注解来指定要加载的配置文件
 * @author : ZhuXiaokang
 * @mail : xiaokang.zhu@pactera.com
 * @date : 2018/9/11 9:49
 * Attention:
 * Modify:
 */
@Component
@PropertySource(value = "classpath:random.properties")
public class CommandLineRunnerExample implements CommandLineRunner {

    @Value("${my.name}")
    private String name;

    @Value("${my.secret}")
    private String secret;

    @Value("${my.number}")
    private int number;

    @Value("${my.bignumber}")
    private long bigNumber;

    @Value("${my.uuid}")
    private String uuid;

    @Value("${my.number.less.than.ten}")
    private int numberLessThanTen;

    @Value("${my.number.in.range}")
    private int numberInRange;

    @Override
    public void run(String... strings) throws Exception {
        StringBuilder builder = new StringBuilder();
        builder.append("name=").append(name).append(" , ")
                .append("secret=").append(secret).append(" , ")
                .append("number=").append(number).append(" , ")
                .append("bigNumber=").append(bigNumber).append(" , ")
                .append("uuid=").append(uuid).append(" , ")
                .append("numberLessThanTen=").append(numberLessThanTen).append(" , ")
                .append("numberInRange=").append(numberInRange).append(" , ");
        System.err.println("Application启动后执行: CommandLineRunner");
        System.err.println(builder.toString());
    }
}
