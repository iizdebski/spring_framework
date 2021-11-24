package com.izdebski.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.izdebski.dao.exception.InsufficientAccountBalanceException;
import com.izdebski.model.Account;
import com.izdebski.service.BankService;
import com.izdebski.service.Impl.BankServiceImpl;

public class Test {

    public static void main(String[] args) {

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        BankService bankService = ctx.getBean("bankService", BankServiceImpl.class);
        Account fromAccount = new Account();
        fromAccount.setAccountNumber(112233L);

        Account toAccount = new Account();
        toAccount.setAccountNumber(335533L);

        try {
            bankService.transferFund(fromAccount, toAccount, 1000.00);
        } catch (InsufficientAccountBalanceException e) {
            e.printStackTrace();
        }
        ctx.close();

    }

}