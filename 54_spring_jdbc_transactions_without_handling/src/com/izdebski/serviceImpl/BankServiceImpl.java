package com.izdebski.serviceImpl;

import com.izdebski.dao.BankDAO;
import com.izdebski.exception.InsufficientAccountBalanceException;
import com.izdebski.model.Account;
import com.izdebski.service.BankService;


public class BankServiceImpl implements BankService {

    private BankDAO bankDAO;

    public void setBankDAO(BankDAO bankDAO) {
        this.bankDAO = bankDAO;
    }

    public BankDAO getBankDAO() {
        return bankDAO;
    }

    @Override
    public void transferFund(Account fromAccount, Account toAccount, Double amount) throws InsufficientAccountBalanceException {
        getBankDAO().withdraw(fromAccount, amount);
        getBankDAO().deposit(toAccount, amount);
    }
}