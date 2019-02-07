package com.psl.employee.service;

import java.util.List;

import com.psl.employee.model.Employee;

public interface EmployeeService {
	
public void create(Employee employee);
	
    public void update(Employee employee);
	
	public Employee getEmpById(int emp_ID);
	
	public List<Employee> listEmployee();
	
	public void delete(int emp_ID);
	
	public int validate(String uname,String lastName);

	public List<Employee> employeedetails(String uname, String lastName);

}
