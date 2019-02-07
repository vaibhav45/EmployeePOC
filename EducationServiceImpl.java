package com.psl.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.psl.employee.dao.IEducationdao;
import com.psl.employee.model.Education;
import com.psl.employee.model.Employee;

@Component
public class EducationServiceImpl implements IEducationService {

	@Autowired
	IEducationdao educationDao;
	
	public IEducationdao getEducationDao() {
		return educationDao;
	}

	public void setEducationDao(IEducationdao educationDao) {
		this.educationDao = educationDao;
	}

	@Override
	public void insert(Education education) {
		educationDao.insert(education);

	}

	@Override
	public void update(Education education) {

		educationDao.update(education);

	}

	@Override
	public Education getDetails(int empid) {
		
		return educationDao.getDetails(empid);
	}

	@Override
	public int validate(int empid) {
		
		return educationDao.validate(empid);
	}

	@Override
	public List<Education> employeeEduDetails(int empid) {
		
		return educationDao.employeeEduDetails(empid);
	}

	@Override
	public List<Education> EduDetails() {
		
		return educationDao.EduDetails();
	}

}
