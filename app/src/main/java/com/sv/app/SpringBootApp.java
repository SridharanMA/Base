package com.sv.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.sv.app.dao")
public class SpringBootApp{
    public static void main(String[] args) 
    {
    	SpringApplication.run(SpringBootApp.class, args);
    }
/*    @Bean  
    public InternalResourceViewResolver viewResolver() {  
	InternalResourceViewResolver resolver = new InternalResourceViewResolver();  
        resolver.setPrefix("/WEB-INF/views/");  
        resolver.setSuffix(".jsp");
        return resolver;  
    }*/
}
