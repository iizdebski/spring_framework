package com.izdebski.client;

import com.izdebski.model.RandomNumberGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        RandomNumberGenerator randomNumberGenerator = ctx.getBean("randomNumberGenerator", RandomNumberGenerator.class);

        System.out.println(randomNumberGenerator.getRandomNumber());
        System.out.println(randomNumberGenerator.getPi());

    }
}