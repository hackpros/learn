package org.learn.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * spring boot 启动入口
 * @author fwg create by  2016年3月3日 下午2:59:21
 *
 */
@SpringBootApplication
@EnableConfigurationProperties({JdbcConfig.class})
public class ExpConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Exp1Application.class, args);
    }
}
