package com.izdebski.dao.impl;

import com.izdebski.dao.EmployeeDAO;
import com.izdebski.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.List;

@Repository
public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDAO {

    @Autowired
    //private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    /*public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /*@Override
    public void createEmployee(Employee employee) {
        Connection connection = null;
        PreparedStatement ps = null;

        try{
            connection=dataSource.getConnection();
            String SQL = "INSERT INTO employee_table(employee_name, email, gender,salary) VALUES(?,?,?,?)";
            ps = connection.prepareStatement(SQL);

            ps.setString(1, employee.getEmployeeName());
            ps.setString(2, employee.getEmail());
            ps.setString(3, employee.getGender());
            ps.setDouble(4, employee.getSalary());

            int executeUpdate = ps.executeUpdate();
            if (executeUpdate>0)
                System.out.println("Employee is created ... ");

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        */

    @Override
    public void createEmployee(Employee employee) {
       /* String SQL = "INSERT INTO employee_table(employee_name, email, gender,salary) VALUES(?,?,?,?)";
        int update = jdbcTemplate.update(SQL, new Object[]{employee.getEmployeeName(),employee.getEmail(),employee.getGender(), employee.getSalary()});
        */

       int update=getJdbcTemplate().update("INSERT INTO employee_table(employee_name, email, gender,salary) VALUES(?,?,?,?)", employee.getEmployeeName(),employee.getEmail(),employee.getGender(), employee.getSalary());
       if(update>0)
            System.out.println("Employee is created ...");
    }



    /*
    public void setJdbcTeplate(JdbcTemplate jdbcTemplate){
    this.jdbcTemplate=jdbcTemplate;
    }
    */

    @PostConstruct
    public void init(){
        //setJdbcTemplate(jdbcTemplate);
        setDataSource(dataSource);
    }


    @Override
    public Employee getEmployeeById(int employeeId) {
        String SQL="SELECT*FROM employee_table WHERE employee_id=?";
        Employee employee = getJdbcTemplate().queryForObject(SQL, new EmployeeRowMapper(), employeeId);
        return employee;
    }

    @Override
    public void deleteEmployeeById(int employeeId) {
        String SQL = "DELETE FROM employee_table WHERE employee_Id=?";
        int update = getJdbcTemplate().update(SQL, employeeId);
        if(update>0)
            System.out.println("Employee is deleted ...");
    }

    @Override
    public void updateEmployeeEmailById(String newEmail, int employeeId) {
        String SQL = "UPDATE employee_table set email=? WHERE employee_Id=?";
        int update = getJdbcTemplate().update(SQL, newEmail, employeeId);
        if(update>0)
            System.out.println("Email is updated ...");
    }

    @Override
    public List<Employee> getAllEmployeesDetails() {
        String SQL="SELECT*FROM employee_table";

        return getJdbcTemplate().query(SQL, new EmployeeRowMapper());
    }
}