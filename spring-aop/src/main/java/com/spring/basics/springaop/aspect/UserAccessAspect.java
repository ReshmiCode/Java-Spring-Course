package com.spring.basics.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // intercept any return type in that package any class any function any arguments
    // weaving and weaver, point cut
    @Before("com.spring.basics.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public void before(JoinPoint joinPoint) {
        // advice
        //logger.info(" Check for user access");
        logger.info(" Allowed execution for {}", joinPoint);
    }
}
