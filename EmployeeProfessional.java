package com.psl.employee.model;

public class EmployeeProfessional {

	private int empl_ID;
	private String previous_Company;
	private long salary;
	private  String role;
	private int yearsOfExp;
	
	public int getEmpl_ID() {
		return empl_ID;
	}
	public void setEmpl_ID(int empl_ID) {
		this.empl_ID = empl_ID;
	}
	public String getPrevious_Company() {
		return previous_Company;
	}
	public void setPrevious_Company(String previous_Company) {
		this.previous_Company = previous_Company;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getYearsOfExp() {
		return yearsOfExp;
	}
	public void setYearsOfExp(int yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}
	
	
}
