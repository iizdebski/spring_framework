package com.izdebski.service.impl;

import com.izdebski.model.Account;

public interface AccountService {

    public abstract void updateAccountBalance(Account account, Long amount);
}