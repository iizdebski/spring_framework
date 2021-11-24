package com.izdebski.client;

import com.izdebski.model.PerimeterCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        PerimeterCalculator calculator = ctx.getBean("perimeterCalculator", PerimeterCalculator.class);

        System.out.println(calculator.getPerimeter());
    }
}