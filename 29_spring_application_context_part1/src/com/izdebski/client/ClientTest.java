package com.izdebski.client;

import com.izdebski.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = (Employee) context.getBean("employee", Employee.class);

        System.out.println(employee.getEmployeeId() + "\t" + employee.getEmployeeName());

        ((ClassPathXmlApplicationContext) context).close();
    }
}