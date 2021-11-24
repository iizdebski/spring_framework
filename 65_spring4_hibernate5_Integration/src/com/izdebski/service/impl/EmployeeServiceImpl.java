package com.izdebski.service.impl;

import java.util.List;

import com.izdebski.dao.EmployeeDAO;
import com.izdebski.model.Employee;
import com.izdebski.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeDAO.createEmployee(employee);
    }

    @Override
    public Employee fetchEmployeeById(int employeeId) {
        return employeeDAO.getEmployeeById(employeeId);
    }

    @Override
    public List<Employee> getAllEmployeesInfo() {
        return employeeDAO.getAllEmployeesDetails();
    }
}