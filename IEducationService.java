package com.psl.employee.service;

import java.util.List;

import com.psl.employee.model.Education;

public interface IEducationService {

	public void insert(Education education);
	
	public void update(Education education);
	
	public Education getDetails(int empid);
	
	public  int validate(int empid);
	
	public  List<Education> employeeEduDetails(int emp_id);

	public List<Education> EduDetails();
}
