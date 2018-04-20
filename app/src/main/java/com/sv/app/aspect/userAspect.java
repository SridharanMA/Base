package com.sv.app.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
/*
@Aspect
@Configuration
public class userAspect {
	private Logger log = LoggerFactory.getLogger(userAspect.class);
	@Around("execution(* com.sv.app.dao.*.*(..))")
	public void beforeExe(JoinPoint jp) {
		log.info("we are before advice");
		System.out.println("we are before advice" + jp.getKind() + "" + jp.ADVICE_EXECUTION);
	}
}*/