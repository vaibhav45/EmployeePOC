package com.psl.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.psl.employee.dao.IEmpProfessionalDao;
import com.psl.employee.model.EmployeeProfessional;

@Component
public class EmpProfessionalServiceImpl implements IEmpProfessionalService {

	
	@Autowired
	IEmpProfessionalDao empProfDao;
	
	
	public IEmpProfessionalDao getEmpProfDao() {
		return empProfDao;
	}

	public void setEmpProfDao(IEmpProfessionalDao empProfDao) {
		this.empProfDao = empProfDao;
	}

	@Override
	public void insert(EmployeeProfessional empProfessional) {
		
		empProfDao.insert(empProfessional);

	}

	@Override
	public void update(EmployeeProfessional empProfessional) {
		
		empProfDao.update(empProfessional);

	}

	@Override
	public EmployeeProfessional getProfessional(int empid) {
		
		return empProfDao.getProfessional(empid);
	}

	@Override
	public int validate(int empid) {
		
		return empProfDao.validate(empid);
	}

	@Override
	public List<EmployeeProfessional> employeeProfDetails(int empid) {
		
		return empProfDao.employeeProfDetails(empid);
	}

}
