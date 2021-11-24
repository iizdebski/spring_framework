package com.izdebski.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutDefinition {

    @Pointcut("within(com.izdebski.web..*)")
    public void webLayer() {

    }

    @Pointcut("within(com.izdebski.service..*)")
    public void serviceLayer() {

    }

    @Pointcut("within(com.izdebski.dao..*)")
    public void dataAccessLayer() {

    }
}