package com.izdebski.client;

import com.izdebski.CustomEventPublisher;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        CustomEventPublisher customEventPublisher = ctx.getBean("customEventPublisher", CustomEventPublisher.class);

        customEventPublisher.publicEvent();
        ctx.close();

    }
}
