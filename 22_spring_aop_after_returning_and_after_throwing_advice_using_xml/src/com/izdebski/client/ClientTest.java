package com.izdebski.client;

import com.izdebski.model.Account;
import com.izdebski.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {

    public static void main(String[] args) throws Exception {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        AccountServiceImpl accountService = ctx.getBean("accountService", AccountServiceImpl.class);

        Account account = accountService.getAccountByCustomerId(null);
        if(account != null)
            System.out.println(account.getAccountNumber()+"\t"+account.getAccountDescription());
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}