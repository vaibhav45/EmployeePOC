package com.psl.employee.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.psl.employee.model.Education;
import com.psl.employee.model.Employee;
import com.psl.employee.model.EmployeeProfessional;
import com.psl.employee.service.EmployeeService;
import com.psl.employee.service.IEducationService;
import com.psl.employee.service.IEmpProfessionalService;

@RestController
//@RequestMapping("employee")
public class EmployeeController {
	

	@Autowired
	private EmployeeService employeeService;
	
	

	public EmployeeService getemployeeService() {
		return employeeService;
	}

	public void setemployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

/*	@RequestMapping(value="/create",method = RequestMethod.POST)
	public ModelAndView create(@ModelAttribute("employee") Employee employee ) {
		employeeService.create(employee);
		return new ModelAndView("redirect:/login");
		
	}*/
	
	@RequestMapping(value="/create",method = RequestMethod.POST)
	public ModelAndView create(@RequestParam("firstname")String firstName,
			@RequestParam("lastname") String lastName, @RequestParam("dateofbirth")Date dateOfBirth,
			@RequestParam("contact")long contact,
			@RequestParam("email")String email,@RequestParam("address")String address,ModelAndView mv) {
		System.out.println("Enetered into create POST==============");
		System.out.println("firstName--------"+firstName);	
		Employee employee = new Employee();
//		employee.setEmp_ID(Emp_ID);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setDateOfBirth(dateOfBirth);
		employee.setContact(contact);
		employee.setEmail(email);
		employee.setAddress(address);
		System.out.println("that uis "+firstName);
		employeeService.create(employee);
		
		
		return new ModelAndView("redirect:/");
		
	}
	
			//  home page URl	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home(Model model) {
		model.addAttribute("employee" ,new Employee());
		return new ModelAndView("home");
	}

			//  Registartion URl			
	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public ModelAndView home2(Model model) {
//		model.addAttribute("employee" ,new Employee());
		return new ModelAndView("registration");
	}

			//	Getting Employees URL
	@RequestMapping(value="/employees", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Employee> list(ModelAndView model) {
		List<Employee> empList=employeeService.listEmployee();
		model.addObject("employee",empList);
//		model.setViewName("list");
		return empList;
	}
	
	
	//  getting employee by id original
	/*@RequestMapping(value="/edit/{emp_ID}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String edit(@PathVariable int emp_ID,Model m) {
		Employee emp = employeeService.getEmpById(emp_ID);
		//ModelAndView model = new ModelAndView("update");
		m.addAttribute("employee",emp);
		return emp ;
	}
	*/
	
		// Get  Employee BY ID URl
	@RequestMapping(value="/edit/{emp_ID}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Employee edit(@PathVariable int emp_ID,Model m) {
//		Employee emp = employeeService.getEmpById(emp_ID); //List<Employee> l = new ArrayList<Employee>(); 
		Employee emp =employeeService.getEmpById(emp_ID);
//		l.add(emp);//ModelAndView model = new ModelAndView("update");
//		m.addAttribute("employee",emp);
		return emp ;
	}
	
	
	/*@RequestMapping(value="/editSave",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("employee") Employee employee){    
		employeeService.update(employee);    
        return "redirect:/employees";    
    }    
	*/
	
		// Update Employee URL
	@RequestMapping(value="/editsave",method = RequestMethod.POST)
	public ModelAndView editSave(@RequestParam("firstname")String firstName,
			@RequestParam("lastname")String lastName,@RequestParam("dateofbirth")Date dateOfBirth,@RequestParam("contact")long contact,
			@RequestParam("email")String email,@RequestParam("address")String address,ModelAndView mv) {

		Employee employee = new Employee();
		//	employee.setEmp_ID(Emp_ID);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setDateOfBirth(dateOfBirth);
		employee.setContact(contact);
		employee.setEmail(email);
		employee.setAddress(address);
		System.out.println("that uis "+firstName);
		employeeService.update(employee);
		
		
		return new ModelAndView("redirect:/registration");
	}
		
	@RequestMapping(value="/delete/{emp_ID}")
	public String delete(@PathVariable int emp_ID) {
		employeeService.delete(emp_ID);
		
		return "redirect:/employees";
	
		
	}
	
	
//	Educational Controller

	@Autowired
	IEducationService educationService;
	
	public IEducationService getEducationService() {
		return educationService;
	}

	public void setEducationService(IEducationService educationService) {
		this.educationService = educationService;
	}
	
	@RequestMapping(value = "/edudetails", method = RequestMethod.GET)
	public ModelAndView edu(Model model) {
//		model.addAttribute("employee" ,new Employee());
		return new ModelAndView("edudetails");
	}
	@RequestMapping(value="/inserteducationdetails",method=RequestMethod.POST)
	public ModelAndView insertEduc(@RequestParam("empid") int emp_ID,
			@RequestParam("sscschool") String ssc_SchoolName,
	@RequestParam("sscgrade") float ssc_grade,
	@RequestParam("sscyearofpass") int ssc_YearOfPass,
	@RequestParam("intercollege") String inter_CollegeName,
	@RequestParam("intergrade") float inter_grade,
	@RequestParam("interyearofpass") int inter_YearOfPass,
	@RequestParam("ugcollege") String ug_CollegeName,
	@RequestParam("uggrade") float ug_grade,
	@RequestParam("ugyearofpass") int ug_YearOfPass,
	@RequestParam("pgcollege") String pg_CollegeName,
	@RequestParam("pggrade") float pg_grade,
	@RequestParam("pgyearofpass") int pg_YearOfPass) {
		
		Education edu= new Education();
		edu.setEmp_ID(emp_ID);
		edu.setSsc_SchoolName(ssc_SchoolName);
		edu.setSsc_grade(ssc_grade);
		edu.setSsc_YearOfPass(ssc_YearOfPass);
		edu.setInter_CollegeName(inter_CollegeName);
		edu.setInter_grade(inter_grade);
		edu.setInter_YearOfPass(inter_YearOfPass);
		edu.setUg_CollegeName(ug_CollegeName);
		edu.setUg_grade(ug_grade);
		edu.setUg_YearOfPass(ug_YearOfPass);
		edu.setPg_CollegeName(pg_CollegeName);
		edu.setPg_grade(pg_grade);
		edu.setPg_YearOfPass(pg_YearOfPass);
		System.out.println("emp_ID" + emp_ID);
		educationService.insert(edu);
		return new ModelAndView("redirect:/profile");
		
	}
	
//	@RequestMapping(value="/updateEducation",method)
	
	/*@RequestMapping(value="/vieweducation/{emp_ID}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ModelAndView view(@PathVariable int emp_ID,Model m) {
		Education edu = educationService.getDetails(emp_ID);
		ModelAndView model = new ModelAndView("education");
		model.addObject("education",edu);
		return model;
	}*/

	@RequestMapping(value="/details",method=RequestMethod.GET)
	public ModelAndView login2(@RequestParam("empid") int empid, Model model,Education edu) {
		
		int m=educationService.validate(empid);
		
//		System.out.println("Data" +m);
		
		
//		System.out.println(m);
		if(m==2) 
		{
		List<Education> empList=educationService.employeeEduDetails(empid);
		System.out.println(empList);
		model.addAttribute("empi", empList);
		return new ModelAndView("edudetails");
		}
		else {
			return new ModelAndView("education");
		}
	}
	@RequestMapping(value = "/eduupdate", method = RequestMethod.GET)
	public ModelAndView details(Model model) {
//		model.addAttribute("employee" ,new Employee());
		return new ModelAndView("eduupdate");
	}
	
	 @RequestMapping(value = "/vieweducation/{emp_ID}")
	    public ModelAndView editEmployee(@ModelAttribute("education") Education education , 
	    @PathVariable("emp_ID") int empid)
	    {
	        ModelAndView model = new ModelAndView("eduupdate");
	        
	        Education edu = educationService.getDetails(empid);
	       
//	        List<Education> employeeList = educationService.EduDetails();
	        
//	        model.addObject("education",edu);        
	        model.addObject("empi",edu);
	        
	        return model;
	    }
	/* @RequestMapping(value="/vieweducation/{emp_ID}",method = RequestMethod.GET, headers = "Accept=application/json")    
	    public ModelAndView view(@PathVariable int empid){    
		 Education edu = educationService.getDetails(empid);  
		 ModelAndView model = new ModelAndView("education");
//		 System.out.println(edu);1
//		 model.setViewName("education");
	     model.addObject("empi",edu);
	     return model;    
	    }   */ 
	    /* It updates model object. */    
	    @RequestMapping(value="/updateeducation",method = RequestMethod.POST)    
	    public ModelAndView editsave(@ModelAttribute("education") Education education){    
	        educationService.update(education);    
	        return new ModelAndView("redirect:/profile");    
	    }    
	
	/*@RequestMapping(value="/updateeducation",method = RequestMethod.POST)    
    public String updateEducation(@ModelAttribute("education") Education education){    
        educationService.update(education);    
        return "redirect:/success";    
    }*/
	
	
//	Employee Professional Controller	
	
	@Autowired
	IEmpProfessionalService empProfService;
	
	/*public IEmpProfessionalService getEmpProfService() {
		return empProfService;
	}

	public void setEmpProfService(IEmpProfessionalService empProfService) {
		this.empProfService = empProfService;
	}*/

	@RequestMapping(value = "/professionaldetails", method = RequestMethod.GET)
	public ModelAndView profe(Model model) {
//		model.addAttribute("employee" ,new Employee());
		return new ModelAndView("professionaldetails");
	}

	@RequestMapping(value="/profedetails",method=RequestMethod.GET)
	public ModelAndView profe(@RequestParam("empid") int empid, Model model,Education edu) {
		
		int m=empProfService.validate(empid);
		
//		System.out.println("Data" +m);
		
		
//		System.out.println(m);
		if(m==2) 
		{
		List<EmployeeProfessional> empList=empProfService.employeeProfDetails(empid);
		System.out.println(empList);
		model.addAttribute("empi", empList);
		return new ModelAndView("professionaldetails");
		}
		else {
			return new ModelAndView("professional");
		}
	}
	@RequestMapping(value="/insertprofessional", method=RequestMethod.POST, headers = "Accept=application/json")
	
		public ModelAndView insertEduc(@RequestParam("empid") int emp_ID,
		@RequestParam("previouscompany") String previous_Company,
		@RequestParam("salary") long salary,
		@RequestParam("role")  String role,
		@RequestParam("yearsofexp") int yearsOfExp) {
		
		EmployeeProfessional empp= new EmployeeProfessional();
		empp.setEmpl_ID(emp_ID);
		empp.setPrevious_Company(previous_Company);
		empp.setSalary(salary);
		empp.setRole(role);
		empp.setYearsOfExp(yearsOfExp);
		System.out.println(role);
		empProfService.insert(empp);
		return new ModelAndView("redirect:/profile");
		
}
		
	@RequestMapping(value="/viewprofessional/{empl_ID}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ModelAndView view2(@PathVariable("empl_ID") int empid) {
		EmployeeProfessional pro = empProfService.getProfessional(empid);
		
		ModelAndView model = new ModelAndView("profupdate");
		
		model.addObject("empi",pro);
//		model.setViewName("professional");
		return model;
	}
	
	@RequestMapping(value="/updateemployeeprofessional",method = RequestMethod.POST)    
    public ModelAndView updateEmployeeProfessional(@ModelAttribute("employeeProfessional") EmployeeProfessional employeeProfessional){    
        empProfService.update(employeeProfessional);    
        return new ModelAndView("redirect:/profile");    
    }  
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView login(Model model) {
//		model.addAttribute("employee" ,new Employee());
		return new ModelAndView("login");
	}

/*@RequestMapping(value="/login",method=RequestMethod.GET)
public ModelAndView login2(@RequestParam("uname") String email,@RequestParam("psw") String lastName, Model model,Employee emp) {
	
	int m=employeeService.validate(email, lastName);
	
	 model.addAttribute("ID", emp.getEmp_ID());
	
//	System.out.println(m);
	if(m==2) {
	return new ModelAndView("home");
	}
	else {
		return new ModelAndView("login");
	}
}*/
	
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login2(@RequestParam("uname") String email,@RequestParam("psw") String lastName, Model model,Employee emp) {
		
		int m=employeeService.validate(email, lastName);
		
//		System.out.println("Data" +m);
		
		
//		System.out.println(m);
		if(m==2) 
		{
		List<Employee> emplist=employeeService.employeedetails(email, lastName);
		System.out.println(emplist);
		model.addAttribute("empi", emplist.get(0));
		return new ModelAndView("home");
		}
		else {
			return new ModelAndView("login");
		}
	}

	
		//Profile page

@RequestMapping(value = "/profile", method = RequestMethod.GET)
public ModelAndView profile(Model model) {
//	model.addAttribute("employee" ,new Employee());
	return new ModelAndView("profile");
}

@RequestMapping(value = "/Test", method = RequestMethod.GET)
public ModelAndView profile2(Model model) {
//	model.addAttribute("employee" ,new Employee());
	return new ModelAndView("Test");
}

@RequestMapping(value = "/formedu", method = RequestMethod.GET)
public ModelAndView eduformSerch(Model model) {
	return new ModelAndView("formedu");
}
@RequestMapping(value = "/formprof", method = RequestMethod.GET)
public ModelAndView profeSearch(Model model) {
	return new ModelAndView("formProf");
}

}





