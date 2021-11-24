package com.izdebski.service;

import java.util.List;

import com.izdebski.model.Employee;

public interface EmployeeService {

    public abstract void addEmployee(Employee employee);
    public abstract Employee fetchEmployeeById(int employeeId);
    public abstract List<Employee> getAllEmployeesInfo();
}