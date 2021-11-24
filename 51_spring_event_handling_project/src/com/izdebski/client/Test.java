package com.izdebski.client;

import com.izdebski.model.Message;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        ctx.start();

        Message message = ctx.getBean("message", Message.class);

        System.out.println(message.getMessageId()+"\t"+message.getMessage());

        System.out.println("--------------------------------------------------");

        ctx.stop();

        ctx.close();

    }
}