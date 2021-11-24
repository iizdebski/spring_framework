package com.izdebski.client;

import com.izdebski.model.ATM;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        ATM atm =ctx.getBean("atm", ATM.class);

        atm.printBalanceInformation("BAJ5656HA");

        ctx.close();
    }
}
