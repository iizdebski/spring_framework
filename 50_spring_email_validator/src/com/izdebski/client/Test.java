package com.izdebski.client;

import com.izdebski.model.EmailValidator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        EmailValidator emailValidator = ctx.getBean("emailValidator", EmailValidator.class);

        System.out.println(emailValidator.getIsValidEmail());
        ((ClassPathXmlApplicationContext) ctx).close();

    }
}