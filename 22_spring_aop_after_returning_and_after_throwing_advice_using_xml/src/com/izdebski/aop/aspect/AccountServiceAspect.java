package com.izdebski.aop.aspect;

import com.izdebski.model.Account;
import org.aspectj.lang.JoinPoint;

public class AccountServiceAspect {

    public void afterReturningAdvice (JoinPoint joinPoint, Account account){
        System.out.println("After Returning method:"+joinPoint.getSignature().getName()+",Class"+joinPoint.getTarget()
        .getClass().getSimpleName());

        System.out.println(account);
    }

    public void afterThrowingAdvice(JoinPoint joinPoint, Exception ex){
        System.out.println("After Throwing exception in method:"+joinPoint.getSignature().getName()+",Class"+joinPoint.getTarget()
        .getClass().getSimpleName());
        System.out.println("Exception is:"+ex.getMessage());
    }
}