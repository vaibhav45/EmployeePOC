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

import com.psl.employee.model.Education;
import com.psl.employee.model.Employee;

@Component
public class EducationDaoImpl implements IEducationdao {

	@Autowired
	JdbcTemplate  template;
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	@Override
	public void insert(Education education) {
		
		String sql = "insert into Employee_Edu_Details(Emp_ID,SSC_SchoolName,SSC_Grade,SSC_YearOfPass,Inter_CollegeName,"
				+ "Inter_Grade,Inter_YearOfPass,UG_CollegeName,UG_Grade,UG_YearOfPass,PG_CollegeName,PG_Grade,PG_YearOfPass)"
				+ " values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		template.update(sql,education.getEmp_ID(),education.getSsc_SchoolName(),education.getSsc_grade(),education.getSsc_YearOfPass(),
				education.getInter_CollegeName(),education.getInter_grade(),education.getInter_YearOfPass(),education.getUg_CollegeName(),
				education.getUg_grade(),education.getUg_YearOfPass(),education.getPg_CollegeName(),education.getPg_grade(),
				education.getPg_YearOfPass());
		
	}

	@Override
	public void update(Education education) {
		
		String sql = "update employee_edu_details set Emp_Edu_ID=?, SSC_SchoolName=?,SSC_Grade=?,SSC_YearOfPass=?,Inter_CollegeName=?,"
				+ "Inter_Grade=?,Inter_YearOfPass=?,UG_CollegeName=?,UG_Grade=?,UG_YearOfPass=?,PG_CollegeName=?,PG_Grade=?,"
				+ "PG_YearOfPass=? where Emp_Id =? ";
		template.update(sql,education.getEmp_Edu_ID(),education.getSsc_SchoolName(),education.getSsc_grade(),education.getSsc_YearOfPass(),
			education.getInter_CollegeName(),education.getInter_grade(),education.getInter_YearOfPass(),education.getUg_CollegeName(),
				education.getUg_grade(),education.getUg_YearOfPass(),education.getPg_CollegeName(),education.getPg_grade(),
				education.getPg_YearOfPass(),education.getEmp_ID());

	}

	@Override
	public Education getDetails(int empid) {
		
		String  sql = "select * from employee_edu_details where Emp_ID='"+empid+"'";
		
		return template.query(sql, new ResultSetExtractor<Education>() {

			@Override
			public Education extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				Education educ = new Education();
				if(rs.next()) {
				educ.setEmp_ID(rs.getInt("Emp_ID"));
				educ.setEmp_Edu_ID(rs.getInt("Emp_Edu_ID"));
				educ.setSsc_SchoolName(rs.getString("SSC_SchoolName"));
				educ.setSsc_grade(rs.getFloat("SSC_Grade"));
				educ.setSsc_YearOfPass(rs.getInt("SSC_YearOfPass"));
				educ.setInter_CollegeName(rs.getString("Inter_CollegeName"));
				educ.setInter_grade(rs.getFloat("Inter_Grade"));
				educ.setInter_YearOfPass(rs.getInt("Inter_YearOfPass"));
				educ.setUg_CollegeName(rs.getString("UG_CollegeName"));
				educ.setUg_grade(rs.getFloat("UG_Grade"));
				educ.setUg_YearOfPass(rs.getInt("UG_YearOfPass"));
				educ.setPg_CollegeName(rs.getString("PG_CollegeName"));
				educ.setPg_grade(rs.getFloat("PG_Grade"));
				educ.setPg_YearOfPass(rs.getInt("PG_YearOfPass"));
				
				return educ;
			}
			
			return null;
	
			}
		});
	}
	

	@Override
	public List<Education> employeeEduDetails(int empid) {

		String  sql = "select * from employee_edu_details where Emp_ID='"+empid+"'";
		List<Education> employeeEduList = template.query(sql, new RowMapper<Education>()
		
		{

			
			@Override
			public Education mapRow(ResultSet rs, int numRow) throws SQLException
			{
				Education educa = new Education();
				
				educa.setEmp_ID(rs.getInt("Emp_ID"));
				educa.setEmp_Edu_ID(rs.getInt("Emp_Edu_ID"));
				educa.setSsc_SchoolName(rs.getString("SSC_SchoolName"));
				educa.setSsc_grade(rs.getFloat("SSC_Grade"));
				educa.setSsc_YearOfPass(rs.getInt("SSC_YearOfPass"));
				educa.setInter_CollegeName(rs.getString("Inter_CollegeName"));
				educa.setInter_grade(rs.getFloat("Inter_Grade"));
				educa.setInter_YearOfPass(rs.getInt("Inter_YearOfPass"));
				educa.setUg_CollegeName(rs.getString("UG_CollegeName"));
				educa.setUg_grade(rs.getFloat("UG_Grade"));
				educa.setUg_YearOfPass(rs.getInt("UG_YearOfPass"));
				educa.setPg_CollegeName(rs.getString("PG_CollegeName"));
				educa.setPg_grade(rs.getFloat("PG_Grade"));
				educa.setPg_YearOfPass(rs.getInt("PG_YearOfPass"));
				
				return educa;
			
			}
		});
		
		return employeeEduList;
		
		
		}

	@Override
	public int validate(int empid) {
		String sql="select Emp_ID from employee_edu_details where Emp_ID='"+empid+"'";
		return template.query(sql,new ResultSetExtractor<Integer>() {

			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				int i = 0;
				while(rs.next()) {
					
				    int empid=rs.getInt("Emp_ID");
				    System.out.println(empid);
				    Employee emp = new Employee();
				    emp.setEmp_ID(rs.getInt("Emp_ID"));
				   /* 
				    emp.setFirstName(rs.getString("FirstName"));*/
					
				    		if(empid == emp.getEmp_ID()) {
				    			
				    				
						i=2;
						/*System.out.println("login success " +firstname);*/
						System.out.println("educatin id " +empid);
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
	public List<Education> EduDetails() {
		String  sql = "select * from employee_edu_details ";
		List<Education> employeeEduList = template.query(sql, new RowMapper<Education>()
		
		{

			
			@Override
			public Education mapRow(ResultSet rs, int numRow) throws SQLException
			{
				Education educa = new Education();
				
				educa.setEmp_ID(rs.getInt("Emp_ID"));
				educa.setEmp_Edu_ID(rs.getInt("Emp_Edu_ID"));
				educa.setSsc_SchoolName(rs.getString("SSC_SchoolName"));
				educa.setSsc_grade(rs.getFloat("SSC_Grade"));
				educa.setSsc_YearOfPass(rs.getInt("SSC_YearOfPass"));
				educa.setInter_CollegeName(rs.getString("Inter_CollegeName"));
				educa.setInter_grade(rs.getFloat("Inter_Grade"));
				educa.setInter_YearOfPass(rs.getInt("Inter_YearOfPass"));
				educa.setUg_CollegeName(rs.getString("UG_CollegeName"));
				educa.setUg_grade(rs.getFloat("UG_Grade"));
				educa.setUg_YearOfPass(rs.getInt("UG_YearOfPass"));
				educa.setPg_CollegeName(rs.getString("PG_CollegeName"));
				educa.setPg_grade(rs.getFloat("PG_Grade"));
				educa.setPg_YearOfPass(rs.getInt("PG_YearOfPass"));
				
				return educa;
			
			}
		});
		
		return employeeEduList;
		
		
		}
	}
