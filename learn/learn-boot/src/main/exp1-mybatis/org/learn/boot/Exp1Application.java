package org.learn.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * spring boot 启动入口
 * @author fwg create by  2016年3月3日 下午2:59:21
 *
 */
//@SpringBootApplication
@Configuration  
@EnableConfigurationProperties({JdbcConfig.class})
@ComponentScan
//@EnableAutoConfiguration  

 
public class Exp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Exp1Application.class, args);
    }
}
