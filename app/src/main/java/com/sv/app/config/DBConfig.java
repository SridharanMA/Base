package com.sv.app.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration 
//@EnableTransactionManagement
public class DBConfig {
/*	@Autowired
	BasicDataSource dataSource;
	@Bean
	public HibernateTemplate hibernateTemplate() {
		return new HibernateTemplate(sessionFactory());
	}
	@Bean
	public SessionFactory sessionFactory() {
		return new LocalSessionFactoryBuilder(dataSource)
		   .buildSessionFactory();
	}
	@Bean
	public DataSource getDataSource() {
	        BasicDataSource dataSource = new BasicDataSource();
	        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/concretepage");
	        dataSource.setUsername("root");
	        dataSource.setPassword("");
	        return dataSource;
	}
	@Bean
	public HibernateTransactionManager hibTransMan(){
		return new HibernateTransactionManager(sessionFactory());
	}*/
	

/*    @Bean
    public HibernateJpaSessionFactoryBean sessionFactory(EntityManagerFactory emf) {
         HibernateJpaSessionFactoryBean factory = new HibernateJpaSessionFactoryBean();
         factory.setEntityManagerFactory(emf);
         return factory;
    }*/
/*	@Autowired
	SessionFactory sessionFactory;
	*/
/*    @Bean
    public Session session(){
    AnnotationConfiguration cfg=new AnnotationConfiguration();
    cfg.configure("classpath:hibernate.cfg.xml"); 

    SessionFactory factory = cfg.buildSessionFactory();
    return factory.openSession();
    }*/
	
	/*
	@Autowired
	  private Environment env;
	  @Bean
	  public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	    
	    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	    vendorAdapter.setDatabase(Database.ORACLE);
	    vendorAdapter.setGenerateDdl(true);
	    
	    LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
	    em.setDataSource(dataSource());
	    em.setPackagesToScan("com.thomasvitale.model");
	    em.setJpaVendorAdapter(vendorAdapter);
	    em.setJpaProperties(additionalProperties());
	 
	    return em;
	  }
	  
	  @Bean
	  public DataSource dataSource(){
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName(env.getProperty("hibernate.connection.driver_class"));
	    dataSource.setUrl(env.getProperty("hibernate.connection.url"));
	    dataSource.setUsername(env.getProperty("hibernate.connection.username"));
	    dataSource.setPassword(env.getProperty("hibernate.connection.password"));
	    return dataSource;
	  }
	  
	  @Bean
	  public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
	    JpaTransactionManager transactionManager = new JpaTransactionManager();
	    transactionManager.setEntityManagerFactory(emf);
	  
	    return transactionManager;
	  }
	  
	  @Bean
	  public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
	    return new PersistenceExceptionTranslationPostProcessor();
	  }
	  Properties additionalProperties() {
	    Properties properties = new Properties();
	    properties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
	    properties.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
	    properties.setProperty("hibernate.current_session_context_class", env.getProperty("hibernate.current_session_context_class"));
	    return properties;
	  }
	*/
}
