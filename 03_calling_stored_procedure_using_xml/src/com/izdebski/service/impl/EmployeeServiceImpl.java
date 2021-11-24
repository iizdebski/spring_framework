package com.izdebski.service.impl;

import com.izdebski.dao.EmployeeDAO;
import com.izdebski.model.Employee;
import com.izdebski.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    private EmployeeDAO employeeDAO;

    @Override
    public Employee fetchEmployeeNamAndSalaryById(int employeeId) {
        return employeeDAO.getEmployeeNameAndSalaryById(employeeId);
    }
}