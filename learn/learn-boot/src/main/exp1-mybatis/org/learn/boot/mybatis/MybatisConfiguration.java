package org.learn.boot.mybatis;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * 获取第二个数据库的连接信息，在application.yml中配置，并指定特定的前缀
 * 
 */
@Configuration
@ConditionalOnClass({ EnableTransactionManagement.class, EntityManager.class })
@AutoConfigureAfter({ DataBaseConfiguration.class })
@MapperScan(basePackages = { "org.learn.boot.dao" })
public class MybatisConfiguration implements EnvironmentAware {
	private static Log logger = LogFactory.getLog(MybatisConfiguration.class);

	private RelaxedPropertyResolver propertyResolver;

	@Resource(name = "druDataSource")
	private DataSource druDataSource;

	@Override
	public void setEnvironment(Environment environment) {
		this.propertyResolver = new RelaxedPropertyResolver(environment, "mybatis.");
	}

	@Bean
	@ConditionalOnMissingBean
	public SqlSessionFactory sqlSessionFactory() {
		try {
			SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
			sessionFactory.setDataSource(druDataSource);
			sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
					.getResources("classpath*:org/learn/boot/dao/generated/*.xml"));
			sessionFactory.setConfigLocation(new DefaultResourceLoader().getResource("classpath:mybatis-config.xml"));

			return sessionFactory.getObject();
		} catch (Exception e) {
			logger.warn("Could not confiure mybatis session factory");
			return null;
		}
	}

	/*
	 * @Bean public RoundRobinRWRoutingDataSourceProxy
	 * roundRobinDataSouceProxy(){ RoundRobinRWRoutingDataSourceProxy proxy =
	 * new RoundRobinRWRoutingDataSourceProxy();
	 * proxy.setWriteDataSource(writeDataSource);
	 * proxy.setReadDataSoures(readDataSources); proxy.setReadKey("READ");
	 * proxy.setWriteKey("WRITE");
	 * 
	 * return proxy; }
	 * 
	 * @Bean
	 */
	
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(druDataSource);
	}

}