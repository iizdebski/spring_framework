package com.izdebski.service;

import com.izdebski.model.Employee;

public interface EmployeeService {

    public abstract Employee fetchEmployeeNamAndSalaryById(int employeeId);

}