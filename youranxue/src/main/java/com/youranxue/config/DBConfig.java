package com.youranxue.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan({"com.youranxue.domain.mapper","com.youranxue.domain.entity.mapper"})
public class DBConfig {

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
		factory.setDataSource(dataSource);
		return factory;
	}

	@Bean
	@Primary
	@Autowired
	protected PlatformTransactionManager createTransactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
}