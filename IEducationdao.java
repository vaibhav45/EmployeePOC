package com.psl.employee.dao;

import java.util.List;

import com.psl.employee.model.Education;

public interface IEducationdao {
	
	public void insert(Education education);
	
	public void update(Education education);
	
	public Education getDetails(int empid);
	
	public  int validate(int empid);
			
	public  List<Education> employeeEduDetails(int empid);

	public List<Education> EduDetails();
}
