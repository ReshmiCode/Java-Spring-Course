package com.spring.basics.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.spring.basics.springaop.data.*.*(..))")
    public void dataLayerExecution() {}

    @Pointcut("execution(* com.spring.basics.springaop.business.*.*(..))")
    public void businessLayerExecution() {}

    @Pointcut("com.spring.basics.springaop.aspect.CommonJoinPointConfig.businessLayerExecution() && com.spring.basics.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public void allLayerExecution() {}

    @Pointcut("bean(dao*)")
    public void beanContainingDao() {}

    @Pointcut("within(com.spring.basics.springaop.data..*)")
    public void dataLayerExecutionWithWithin() {}

    @Pointcut("@annotation(com.spring.basics.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation() {}
}
