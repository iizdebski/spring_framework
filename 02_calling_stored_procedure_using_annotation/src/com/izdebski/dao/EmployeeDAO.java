package com.izdebski.dao;

import com.izdebski.model.Employee;

public interface EmployeeDAO {

    public abstract Employee getEmployeeNameAndSalaryById(int employeeId);
}
