package com.izdebski.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.izdebski.model.Employee;
import com.izdebski.service.EmployeeService;
import com.izdebski.service.Impl.EmployeeServiceImpl;

public class Test {

    public static void main(String[] args) {

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        EmployeeService employeeService = ctx.getBean("employeeService", EmployeeServiceImpl.class);
        //createEmployee(employeeService);
        //getEmployeeById(employeeService);

        fetchAllEmployeesInfo(employeeService);
        ctx.close();
    }

    private static void fetchAllEmployeesInfo(EmployeeService employeeService) {
        List<Employee> empList = employeeService.getAllEmployeesInfo();
        for (Employee employee : empList) {
            System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmail()+"\t"+employee.getGender()+"\t"+employee.getSalary());
        }
    }

    private static void getEmployeeById(EmployeeService employeeService) {
        Employee employee = employeeService.fetchEmployeeById(6);
        System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmail()+"\t"+employee.getGender()+"\t"+employee.getSalary());
    }

    private static void createEmployee(EmployeeService employeeService) {
        Employee employee = new Employee();
        employee.setEmail("peter.p@yahoo.com");
        employee.setEmployeeName("Peter");
        employee.setGender("Male");
        employee.setSalary(60000.00);

        employeeService.addEmployee(employee);
    }
}