package com.izdebski.client;

import com.izdebski.model.Account;
import com.izdebski.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        AccountServiceImpl accountService = ctx.getBean("accountService", AccountServiceImpl.class);

        accountService.updateAccountBalance(new Account("677888886", "Money transfer"), 3000L);

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}