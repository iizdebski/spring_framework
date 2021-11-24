package com.izdebski.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.izdebski.model.Account;

@Aspect
@Component
public class AccountServiceAspect {

    @Before(value = "execution(* com.izdebski.service.impl.AccountServiceImpl.*(..)) and args(account,..)&& @annotation(auditable) ")
    public void beforeAdvice(JoinPoint joinPoint,Account account,Auditable auditable){
        System.out.println("Before method:"+joinPoint.getSignature().getName()+",Class:"+joinPoint.getTarget().getClass().getSimpleName());

        System.out.println("Audit account access:"+account.getAccountNumber()+", Audit destination:"+auditable.value());
    }
}