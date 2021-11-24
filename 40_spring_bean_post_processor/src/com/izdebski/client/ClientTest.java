package com.izdebski.client;

import com.izdebski.model.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        Message message = ctx.getBean("message", Message.class);

        System.out.println(message.getMessageId()+"\t" + message.getMessage());

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}