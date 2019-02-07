package com.psl.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.psl.employee.model.Employee;
import com.psl.employee.model.EmployeeProfessional;

@Component
public class EmpProfessionDaoImpl implements IEmpProfessionalDao {

	@Autowired
	JdbcTemplate template;
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public void insert(EmployeeProfessional empProfessional) {
	
		String sql = "insert into employee_professional (Empl_ID,Previous_Company,Salary,Role,YearsOfExp) value(?,?,?,?,?)";
		template.update(sql, empProfessional.getEmpl_ID(),empProfessional.getPrevious_Company(),empProfessional.getSalary(),empProfessional.getRole(),
				empProfessional.getYearsOfExp());
		
	}

	@Override
	public void update(EmployeeProfessional empProfessional) {
		
		String sql = "update employee_professional set Previous_Company=?,Salary=?,Role=?,YearsOfExp=? where Empl_ID= ?";
		template.update(sql, empProfessional.getPrevious_Company(),empProfessional.getSalary(),empProfessional.getRole(),
				empProfessional.getYearsOfExp(),empProfessional.getEmpl_ID());
		
	}

	@Override
	public EmployeeProfessional getProfessional(int empid) {
	
		String sql = "select * from employee_professional where Empl_ID='"+empid+"'";
		return template.query(sql, new ResultSetExtractor<EmployeeProfessional>() {

			@Override
			public EmployeeProfessional extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				EmployeeProfessional empProf = new EmployeeProfessional();
				
				if(rs.next()) {
					empProf.setEmpl_ID(rs.getInt("Empl_id"));
					empProf.setPrevious_Company(rs.getString("Previous_Company"));
					empProf.setSalary(rs.getLong("Salary"));
					empProf.setRole(rs.getString("Role"));
					empProf.setYearsOfExp(rs.getInt("YearsOfExp"));
					
					return empProf;
					
				}
				return null;
			}
		});
	}

	@Override
	public int validate(int empid) {
		String sql="select empl_ID from employee_professional where empl_ID='"+empid+"'";
		return template.query(sql,new ResultSetExtractor<Integer>() {

			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				int i = 0;
				while(rs.next()) {
					
				    int empid=rs.getInt("Empl_ID");
				    System.out.println(empid);
				    Employee emp = new Employee();
				    emp.setEmp_ID(rs.getInt("Empl_ID"));
				   /* 
				    emp.setFirstName(rs.getString("FirstName"));*/
					
				    		if(empid == emp.getEmp_ID()) {
				    			
				    				
						i=2;
						/*System.out.println("login success " +firstname);*/
						System.out.println("professional detials of " +empid);
					}
					else {
						i=1;
//						System.out.println("incorrect credentials");
					}
				}
//				System.out.println(i);

				return i;
			}
		});
		
	}

	@Override
	public List<EmployeeProfessional> employeeProfDetails(int empid) {

		System.out.println("hello hi");
		String  sql = "select * from employee_professional where Empl_ID='"+empid+"'";
		List<EmployeeProfessional> employeeProfeList = template.query(sql, new RowMapper<EmployeeProfessional>()
		
		{

			
			@Override
			public EmployeeProfessional mapRow(ResultSet rs, int numRow) throws SQLException
			{
				EmployeeProfessional empProf = new EmployeeProfessional();
				empProf.setEmpl_ID(rs.getInt("Empl_ID"));
				empProf.setPrevious_Company(rs.getString("Previous_Company"));
				empProf.setSalary(rs.getLong("Salary"));
				empProf.setRole(rs.getString("Role"));
				empProf.setYearsOfExp(rs.getInt("YearsOfExp"));
				System.out.println(empProf);
				return empProf;
				
			
			}
		});
		
		return employeeProfeList;
		
		
		}

}
