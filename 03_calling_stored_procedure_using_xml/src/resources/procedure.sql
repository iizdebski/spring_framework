DROP PROCEDURE IF EXISTS springwithjdbcdb.getEmployeeNameAndSalaryById;
CREATE PROCEDURE springwithjdbcdb.getEmployeeNameAndSalaryById(IN emp_id INT,OUT emp_sal DOUBLE,OUT emp_name VARCHAR(100))
BEGIN
  SELECT employee_name,salary INTO emp_name,emp_sal FROM employee_table WHERE employee_id=emp_id;
END;