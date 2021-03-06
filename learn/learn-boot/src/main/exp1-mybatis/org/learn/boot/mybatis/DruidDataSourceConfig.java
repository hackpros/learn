package org.learn.boot.mybatis;


import javax.sql.DataSource;

import org.learn.boot.JdbcConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@PropertySource("classpath:jdbc.properties")
//@MapperScan(basePackages="xxx.repository", sqlSessionFactoryRef = "sqlSessionFactory")
public class DruidDataSourceConfig {
    @Autowired
    private JdbcConfig jdbcConfig;
    @Bean(name="druDataSource", destroyMethod = "close", initMethod="init")
    public DataSource dataSource() {
    	DruidDataSource datasource = new DruidDataSource();
    	datasource.setUrl(jdbcConfig.getUrl());
    	datasource.setDriverClassName(jdbcConfig.getDriver());
    	datasource.setUsername(jdbcConfig.getUsername());
    	datasource.setPassword(jdbcConfig.getPassword());
		return datasource;
    	
    }
   
}