package com.izdebski.model;

public class Employee {

    private int employeeId;
    private String employeeName;
    private String email;

    private Pancard pancard;


    public Employee(int employeeId, String employeeName, String email, Pancard pancard) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.pancard = pancard;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmail() {
        return email;
    }

    public Pancard getPancard() {
        return pancard;
    }
}