package com.izdebski.client;

import com.izdebski.service.Communication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        Communication communication = ctx.getBean("communication", Communication.class);

        communication.communicate();

        ctx.close();
    }
}