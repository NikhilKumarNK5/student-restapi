package com.nikhil.restapi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AspectConfig {
	Logger logger = LoggerFactory.getLogger(getClass());
	
	/*@Before(value = "execution(* com.nikhil.restapi.controller.*.*(..))")
	public void beforeAdvice (JoinPoint joinPoint) {
		logger.info("Inside Before Advice");
	}*/
	
	
	// exactly one method parameter
	@Before(value = "execution(* com.nikhil.restapi.controller.*.*(..)) and args(object)")
	public void beforeAdvice (JoinPoint joinPoint, Object object) {
		logger.info("Request = " + object);
	}
	
	
	// it can be considered as before returning
	/*@After(value = "execution(* com.nikhil.restapi.controller.*.*(..)) and args(object)")
	public void afterAdvice (JoinPoint joinPoint, Object object) {
		logger.info("Request = " + object);
	}*/
	
	
	/*@AfterReturning(value = "execution(* com.nikhil.restapi.controller.*.*(..)) and args(object)", returning = "returningObject")
	public void afterReturningAdvice (JoinPoint joinPoint, Object object, Object returningObject) {
		logger.info("Response = " + returningObject);
	}*/
	
	// combination of before and afterReturning
	/*@Around(value = "execution(* com.nikhil.restapi.controller.*.*(..)) and args(object)")
	public void aroundAdvice (ProceedingJoinPoint proceedingJoinPoint, Object object) {
		logger.info("Request = " + object);
		
		Object returningObject = null;
		try {
			 returningObject = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		logger.info("Response = " + returningObject);
	}*/
}
