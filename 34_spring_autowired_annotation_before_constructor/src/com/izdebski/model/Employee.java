package com.izdebski.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    private int employeeId;
    private String employeeName;

    private Pancard pancard;

    @Autowired
    public Employee(int employeeId, String employeeName, Pancard pancard) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.pancard = pancard;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Pancard getPancard() {
        return pancard;
    }
}