package com.izdebski.service.impl;

import com.izdebski.model.Account;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Override
    public void updateAccountBalance(Account account, Long amount) {
        System.out.println("Account No:"+account.getAccountNumber()+", Amount:"+amount);
    }
}