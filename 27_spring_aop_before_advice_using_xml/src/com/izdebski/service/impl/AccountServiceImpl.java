package com.izdebski.service.impl;

import com.izdebski.model.Account;
import org.aspectj.lang.JoinPoint;

public class AccountServiceImpl {

    public void updateAccountBalance(Account account, Long amount){

        System.out.println("Account No:" + account.getAccountNumber()+", Amount:" + amount);
    }
}