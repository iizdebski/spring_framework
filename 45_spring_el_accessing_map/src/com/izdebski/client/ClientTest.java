package com.izdebski.client;

import com.izdebski.model.TelephoneDirectoryAccessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        TelephoneDirectoryAccessor telephoneDirectoryAccessor = ctx.getBean("telephoneDirectoryAccessor", TelephoneDirectoryAccessor.class);
        System.out.println("Peter's contact no is:");
        System.out.println(telephoneDirectoryAccessor.getTelephoneNumber());

        ctx.close();
    }

}