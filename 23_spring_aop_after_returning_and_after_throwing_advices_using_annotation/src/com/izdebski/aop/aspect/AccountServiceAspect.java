package com.izdebski.aop.aspect;

import com.izdebski.model.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccountServiceAspect {

    @AfterReturning(value="execution(* com.izdebski.service.impl.AccountServiceImpl.*(..))",returning = "account")
    public void afterReturningAdvice (JoinPoint joinPoint, Account account){
        System.out.println("After Returning method:"+joinPoint.getSignature().getName()+",Class"+joinPoint.getTarget()
        .getClass().getSimpleName());

        System.out.println(account);
    }

    @AfterThrowing(value="execution(* com.izdebski.service.impl.AccountServiceImpl.*(..))", throwing = "ex")
    public void afterThrowingAdvice(JoinPoint joinPoint, Exception ex){
        System.out.println("After Throwing exception in method:"+joinPoint.getSignature().getName()+",Class"+joinPoint.getTarget()
        .getClass().getSimpleName());
        System.out.println("Exception is:"+ex.getMessage());
    }
}