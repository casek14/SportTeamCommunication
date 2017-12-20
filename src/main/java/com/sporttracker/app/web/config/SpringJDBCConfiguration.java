package com.sporttracker.app.web.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class SpringJDBCConfiguration {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		// MySQL database we are using
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://172.2.0.1:3306/testDatabase");// change url
		dataSource.setUsername("root");// change userid
		dataSource.setPassword("workshop");// change pwd

		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}

	/*
	 * @Bean public EmployeeDAO employeeDAO() { EmployeeDAOImpl empDao = new
	 * EmployeeDAOImpl(); empDao.setJdbcTemplate(jdbcTemplate()); return empDao; }
	 */

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource());
		sessionFactoryBean.setPackagesToScan(new String[] { "com.sporttracker.app.web.model" });
		// sessionFactoryBean.setHibernateProperties(hibernateProperties() );
		return sessionFactoryBean;

	}

	/*
	 * # TODO (neni potreba zatim) public Properties hibernateProperties() { return
	 * new Properties() { { setProperty("hibernate.hbm2ddl.auto",
	 * env.getProperty("datasource.ddl-auto")); setProperty("hibernate.dialect",
	 * env.getProperty("datasource.hibernate.dialect"));
	 * setProperty("hibernate.show_sql", env.getProperty("datasource.show-sql"));
	 * setProperty("hibernate.format_sql",
	 * env.getProperty("datasource.format-sql")); } }; }
	 */

	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}

}