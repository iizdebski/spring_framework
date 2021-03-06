package com.izdebski.service;

import com.izdebski.exception.InsufficientAccountBalanceException;
import com.izdebski.model.Account;

public interface BankService {

    public abstract void transferFund(Account fromAccount, Account toAccount, Double amount) throws InsufficientAccountBalanceException;
}
