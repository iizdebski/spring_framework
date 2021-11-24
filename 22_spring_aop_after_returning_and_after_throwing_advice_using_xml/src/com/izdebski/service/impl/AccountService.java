package com.izdebski.service.impl;

import com.izdebski.model.Account;

public interface AccountService {

    public abstract Account getAccountByCustomerId(String customerId)
            throws Exception;
}