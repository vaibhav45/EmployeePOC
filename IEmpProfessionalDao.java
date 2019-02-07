package com.psl.employee.dao;

import java.util.List;

import com.psl.employee.model.EmployeeProfessional;

public interface IEmpProfessionalDao {
	
	public void insert(EmployeeProfessional empProfessional);
	
	public void update(EmployeeProfessional empProfessional);
	
	public EmployeeProfessional getProfessional(int empid);
	
	public  int validate(int empid);
	
	List<EmployeeProfessional> employeeProfDetails(int empid);

}
