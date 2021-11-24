package com.izdebski.dao.impl;

import com.izdebski.dao.EmployeeDAO;
import com.izdebski.model.Employee;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import java.util.Map;

public class EmployeeDAOImpl implements EmployeeDAO {

    private SimpleJdbcCall simpleJdbcCall;

    public void setSimpleJdbcCall(SimpleJdbcCall simpleJdbcCall) {
        this.simpleJdbcCall = simpleJdbcCall;
    }

    @Override
    public Employee getEmployeeNameAndSalaryById(int employeeId) {
        simpleJdbcCall.withProcedureName("getEmployeeNameAndSalaryById");

        MapSqlParameterSource inputMap = new MapSqlParameterSource();

        inputMap.addValue("emp_id", employeeId);

        Map<String, Object> outMap = simpleJdbcCall.execute(inputMap);
        Employee employee = new Employee();
        employee.setEmployeeName(((String)outMap.get("emp_name")));
        employee.setSalary((Double)outMap.get("emp_sal"));

        return employee;

    }
}