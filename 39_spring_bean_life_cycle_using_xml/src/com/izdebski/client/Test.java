package com.izdebski.client;

import com.izdebski.model.Message;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        Message message = ctx.getBean("message", Message.class);

        System.out.println(message.getMessageId()+"\t"+message.getMessage());
        ctx.close();

    }
}