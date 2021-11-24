package com.izdebski.client;

import com.izdebski.model.UserDetails;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        UserDetails userDetails = ctx.getBean("userBean", UserDetails.class);

        System.out.println(userDetails.getUserName()+"\t"+userDetails.getPassword());
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}