package com.izdebski.service.Impl;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.izdebski.dao.BankDao;
import com.izdebski.dao.exception.InsufficientAccountBalanceException;
import com.izdebski.model.Account;
import com.izdebski.service.BankService;

public class BankServiceImpl implements BankService {

    private BankDao bankDao;

    public void setBankDao(BankDao bankDao) {
        this.bankDao = bankDao;
    }

    public BankDao getBankDao() {
        return bankDao;
    }

    public void transferFund(Account fromAccount, Account toAccount,
                             Double amount) throws InsufficientAccountBalanceException {
        getBankDao().withdraw(fromAccount, toAccount, amount);
        getBankDao().deposit(fromAccount, toAccount, amount);
    }
}