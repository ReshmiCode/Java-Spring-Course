package com.spring.basics.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAOPAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // intercept any return type in that package any class any function any arguments
    @AfterReturning(value="com.spring.basics.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()", returning="result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info(" {} returned with value {}", joinPoint, result);
    }

    @AfterThrowing(value="com.spring.basics.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()", throwing="exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        // logger.info(" {} throw exception {}", joinPoint, exception);
    }

    @After("com.spring.basics.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void after(JoinPoint joinPoint) {
        // logger.info(" after execution of {}", joinPoint);
    }
}
