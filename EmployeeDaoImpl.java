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
import org.springframework.stereotype.Service;

import com.psl.employee.model.Employee;

@Service
@Component
public class EmployeeDaoImpl implements EmployeeDao {

		@Autowired
		private JdbcTemplate template;
		
		

		public JdbcTemplate getTemplate() {
			return template;
		}

		public void setTemplate(JdbcTemplate template) {
			this.template = template;
		}

		@Override
		public void create(Employee employee) {
			String sql = "insert into Employee_personals(FirstName,LastName,DateOfBirth,Contact,Email,Address) values(?,?,?,?,?,?)";
			template.update(sql, employee.getFirstName(),employee.getLastName(),employee.getDateOfBirth(),employee.getContact(),
					employee.getEmail(),employee.getAddress());
			
			
		}

		@Override
		public void update(Employee employee) {
			String sql = "update employee_personals set FirstName=?,LastName=?,DateOfBirth=?,Contact=?,Email=?,Address=? where Emp_ID=?";
			template.update(sql, employee.getFirstName(),employee.getLastName(),employee.getDateOfBirth(),employee.getContact(),
					employee.getEmail(),employee.getAddress(),employee.getEmp_ID());
			
		}

		@Override
		public Employee getEmpById(int emp_ID) {
			
			String sql="select * from employee_personals where Emp_ID = " +emp_ID;
			return template.query(sql,new ResultSetExtractor<Employee>() {

				@Override
				public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
					if (rs.next()) {
		                Employee emp=new Employee();
		                emp.setEmp_ID(rs.getInt("Emp_ID"));
		                emp.setFirstName(rs.getString("FirstName"));
		                emp.setLastName(rs.getString("LastName"));
		                emp.setDateOfBirth(rs.getDate("DateOfBirth"));
		                emp.setContact(rs.getLong("Contact"));
		                emp.setEmail(rs.getString("Email"));
		                emp.setAddress(rs.getString("Address"));
		                
		                return emp;
		            }	
					return null;
				}
				
			});
		}

		@Override
		public List<Employee> listEmployee() {
			
			String  sql = "select * from Employee_personals";
			List<Employee> employeeList = template.query(sql, new RowMapper<Employee>() {

				@Override
				public Employee mapRow(ResultSet rs, int numRow) throws SQLException {
					
					Employee emp = new Employee();
					  emp.setEmp_ID(rs.getInt("Emp_ID"));
		                emp.setFirstName(rs.getString("FirstName"));
		                emp.setLastName(rs.getString("LastName"));
		                emp.setDateOfBirth(rs.getDate("DateOfBirth"));
		                emp.setContact(rs.getLong("Contact"));
		                emp.setEmail(rs.getString("Email"));
		                emp.setAddress(rs.getString("Address"));
		                System.out.println("Employee: "+emp);
		                return emp;
		           
					
				}
				
			
			}) ;
			
			return employeeList;
		}

		@Override
		public void delete(int emp_ID) {

			String sql="delete from employee_personals where Emp_ID=? ";
			template.update(sql,emp_ID);
			
		}

		@Override
		public int validate(String uname, String lastName) {
			
			String sql="select email,lastname,firstname,emp_Id from employee_personals where email='"+uname+"'";
			return template.query(sql,new ResultSetExtractor<Integer>() {

				@Override
				public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
					int i = 0;
					while(rs.next()) {
						String email=rs.getString("Email");
					    String lastname=rs.getString("LastName");
					   /* String firstname=rs.getString("FirstName");
					    int empid=rs.getInt("Emp_ID");
					    */
					   /* Employee emp = new Employee();
					    emp.setEmp_ID(rs.getInt("Emp_ID"));
					    emp.setFirstName(rs.getString("FirstName"));*/
						
						if(uname.equals(email) && lastName.equals(lastname)) {
							i=2;
							/*System.out.println("login success " +firstname);
							System.out.println("login success " +empid);*/
						}
						else {
							i=1;
//							System.out.println("incorrect credentials");
						}
					}
//					System.out.println(i);

					return i;
				}
			});


			
			
		}

		@Override
		public List<Employee> employeedetails(String uname, String lastName) {

			String  sql = "select * from employee_personals where email='"+uname+"' and lastName='"+lastName+"'";
			List<Employee> employeeList = template.query(sql, new RowMapper<Employee>()
			
			{

				
				@Override
				public Employee mapRow(ResultSet rs, int numRow) throws SQLException
				{
					
					Employee emp = new Employee();
					  emp.setEmp_ID(rs.getInt("Emp_ID"));
		                emp.setFirstName(rs.getString("FirstName"));
		                emp.setLastName(rs.getString("LastName"));
		                emp.setDateOfBirth(rs.getDate("DateOfBirth"));
		                emp.setContact(rs.getLong("Contact"));
		                emp.setEmail(rs.getString("Email"));
		                emp.setAddress(rs.getString("Address"));
//		                System.out.println("Employee: "+emp);
		                
		                return emp;
				}
			}) ;
			
			return employeeList;

		}
		
		
	

}
