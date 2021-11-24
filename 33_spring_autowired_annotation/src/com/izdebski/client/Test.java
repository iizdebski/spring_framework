package com.izdebski.client;

import com.izdebski.model.Employee;
import com.izdebski.model.Pancard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        Employee employee = ctx.getBean("employee", Employee.class);

        System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName());

        System.out.println("----------------------------------------------------------");
        Pancard pancard = employee.getPancard();
        if(pancard != null)
            System.out.println(pancard.getPanHolderName()+"\t"+pancard.getPanNo());
        else
        System.out.println("Pancard info is not available...");
        ((AbstractApplicationContext) ctx).close();
    }
}