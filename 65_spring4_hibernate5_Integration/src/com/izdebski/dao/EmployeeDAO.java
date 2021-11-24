package com.izdebski.dao;

import java.util.List;

import com.izdebski.model.Employee;

public interface EmployeeDAO {

    public abstract void createEmployee(Employee employee);
    public abstract Employee getEmployeeById(int employeeId);
    public abstract List<Employee> getAllEmployeesDetails();
}