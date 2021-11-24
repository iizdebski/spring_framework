package com.izdebski.service.impl;

import com.izdebski.model.Account;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl {

    public Account updateAccountBalance(Account account, Long amount){

        System.out.println("Account No:" + account.getAccountNumber()+", Amount:" + amount);
        return account;
    }
}