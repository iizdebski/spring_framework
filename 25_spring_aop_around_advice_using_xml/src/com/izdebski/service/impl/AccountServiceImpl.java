package com.izdebski.service.impl;

import com.izdebski.model.Account;

public class AccountServiceImpl {

    public Account updateAccountBalance(Account account, Long amount){

        System.out.println("Account No:" + account.getAccountNumber()+", Amount:" + amount);
        return account;
    }
}