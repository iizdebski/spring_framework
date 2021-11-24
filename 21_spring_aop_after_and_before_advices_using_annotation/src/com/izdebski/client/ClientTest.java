package com.izdebski.client;

import com.izdebski.model.Account;
import com.izdebski.service.impl.AccountService;
import com.izdebski.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {

    public static void main(String[] args) {

        ApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");

        AccountService accountService = ctx.getBean("accountService", AccountServiceImpl.class);

        accountService.updateAccountBalance(new Account("6778888886", "Money tranfer"), 3000L);
        ((AbstractApplicationContext) ctx).close();
    }
}