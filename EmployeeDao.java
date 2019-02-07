package com.psl.employee.dao;

import java.util.List;

import com.psl.employee.model.Employee;

public interface EmployeeDao {

	
	public void create(Employee employee);
	
    public void update(Employee employee);
	
	public Employee getEmpById(int emp_ID);
	
	public List<Employee> listEmployee();
	
	public void delete(int emp_ID);
	
	public  int validate(String uname,String lastName);
	
	public  List<Employee> employeedetails(String uname,String lastName);
}
