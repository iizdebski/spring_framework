package com.izdebski.client;

import com.izdebski.model.ExaminationResult;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        ExaminationResult bean = ctx.getBean("examinationResult", ExaminationResult.class);
        System.out.println(bean.getResultMessage());
        System.out.println(bean.getHasPassed());
    }
}