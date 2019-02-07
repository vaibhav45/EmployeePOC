package com.psl.employee.model;

import java.sql.Date;

public class Employee {
	private int emp_ID;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private long contact;
	private String email;
	private String address;
	public int getEmp_ID() {
		return emp_ID;
	}
	public void setEmp_ID(int emp_ID) {
		this.emp_ID = emp_ID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [emp_ID=" + emp_ID + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", contact=" + contact + ", email=" + email + ", address=" + address + "]";
	}

	
}
