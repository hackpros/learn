package org.learn.boot.mybatis;


import javax.sql.DataSource;

import org.learn.boot.JdbcConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

//@Configuration
//@PropertySource("classpath:jdbc.properties")
//@MapperScan(basePackages="xxx.repository", sqlSessionFactoryRef = "sqlSessionFactory")
public class DatasourceConfig {
    @Autowired
    private JdbcConfig jdbcConfig;
    //@Bean(name="mysqlDataSource", destroyMethod = "close", initMethod="init")
    public DataSource dataSource() {
    	
    	HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.jdbc.Driver");
        config.setAutoCommit(false);
        config.setJdbcUrl(jdbcConfig.getUrl());
        config.setUsername(jdbcConfig.getUsername());
        config.setPassword(jdbcConfig.getPassword());
        return new HikariDataSource(config);
    }
   
}