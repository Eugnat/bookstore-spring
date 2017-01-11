package com.zazdravnykh.bookstore.config;

import java.util.Properties;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import com.zazdravnykh.bookstore.repository.BookDAO;

@Configuration
@EnableJpaRepositories(basePackageClasses = BookDAO.class)
public class DBConfig {

	@Bean
	DriverManagerDataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/bookstore_spring?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}

	@Bean
	LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean emFactory = new LocalContainerEntityManagerFactoryBean();
		emFactory.setDataSource(dataSource());
		emFactory.setPersistenceProviderClass(HibernatePersistenceProvider.class);
		emFactory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		// properties.setProperty("hibernate.hbm2ddl.auto", "create");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.format_sql", "false");
		emFactory.setJpaProperties(properties);
		emFactory.setPackagesToScan("com.zazdravnykh.bookstore", "com.zazdravnykh.bookstore.domain");
		return emFactory;
	}

	@Bean
	JpaTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return transactionManager;
	}

}
