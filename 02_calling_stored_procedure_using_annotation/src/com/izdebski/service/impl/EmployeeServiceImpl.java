package com.izdebski.service.impl;

import com.izdebski.dao.EmployeeDAO;
import com.izdebski.model.Employee;
import com.izdebski.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    private EmployeeDAO employeeDAO;

    @Override
    public Employee fetchEmployeeNamAndSalaryById(int employeeId) {
        return employeeDAO.getEmployeeNameAndSalaryById(employeeId);
    }
}