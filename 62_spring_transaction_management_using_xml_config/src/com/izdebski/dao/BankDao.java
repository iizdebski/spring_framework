package com.izdebski.dao;

import com.izdebski.dao.exception.InsufficientAccountBalanceException;
import com.izdebski.model.Account;

public interface BankDao {
    public abstract void deposit(Account fromAccount, Account toAccount, Double amount);
    public abstract void withdraw(Account fromAccount,Account toAccount,Double amount) throws InsufficientAccountBalanceException;
}