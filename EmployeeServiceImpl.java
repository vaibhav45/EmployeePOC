package com.psl.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.psl.employee.dao.EmployeeDao;
import com.psl.employee.model.Employee;

//@Service
@Component
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	EmployeeDao empDao;
	
	public EmployeeDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public void create(Employee employee) {
		
		empDao.create(employee);

	}

	@Override
	public void update(Employee employee) {
		
		empDao.update(employee);

	}

	@Override
	public Employee getEmpById(int emp_ID) {
		
		return empDao.getEmpById(emp_ID);

	}

	@Override
	public List<Employee> listEmployee() {
		
		return empDao.listEmployee();
	}

	@Override
	public void delete(int emp_ID) {

		empDao.delete(emp_ID);

	}

	@Override
	public int validate(String uname,String lastName) {
		return empDao.validate(uname,lastName);
	}

	@Override
	public List<Employee> employeedetails(String uname, String lastName) {
		
		return empDao.employeedetails(uname, lastName);
	}

}
