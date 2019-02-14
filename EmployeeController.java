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
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.psl.employee.model.Education;
import com.psl.employee.model.Employee;
import com.psl.employee.model.EmployeeProfessional;
import com.psl.employee.service.EmployeeService;
import com.psl.employee.service.IEducationService;
import com.psl.employee.service.IEmpProfessionalService;

@RestController
//@RequestMapping("employee")

@SessionAttributes("empi")
//@SessionAttributes("education")
public class EmployeeController {
	

	@Autowired
	private EmployeeService employeeService;
	
	

	public EmployeeService getemployeeService() {
		return employeeService;
	}

	public void setemployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	
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
	
	
	
	
		// Get  Employee BY ID URl
	@RequestMapping(value="/edit/{emp_ID}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Employee edit(@PathVariable int emp_ID,Model m) {	
		Employee emp =employeeService.getEmpById(emp_ID);

		return emp ;
	}
	
	
	
	
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
	public ModelAndView insertEduc(@SessionAttribute("empi")Employee employee,
			@RequestParam("ssc_SchoolName") String ssc_SchoolName,
	@RequestParam("ssc_grade") float ssc_grade,
	@RequestParam("ssc_YearOfPass") int ssc_YearOfPass,
	@RequestParam("inter_CollegeName") String inter_CollegeName,
	@RequestParam("inter_grade") float inter_grade,
	@RequestParam("inter_YearOfPass") int inter_YearOfPass,
	@RequestParam("ug_CollegeName") String ug_CollegeName,
	@RequestParam("ug_grade") float ug_grade,
	@RequestParam("ug_YearOfPass") int ug_YearOfPass,
	@RequestParam("pg_CollegeName") String pg_CollegeName,
	@RequestParam("pg_grade") float pg_grade,
	@RequestParam("pg_YearOfPass") int pg_YearOfPass) {
		
		Education edu= new Education();
		edu.setEmp_ID(employee.getEmp_ID());
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
		educationService.insert(edu);
		return new ModelAndView("redirect:/profile");
		
	}
	


	@RequestMapping(value="/details",method=RequestMethod.GET)
	public ModelAndView login2(@SessionAttribute("empi")Employee employee) {
		int eduid = 0;
		List<Education> empList=educationService.employeeEduDetails(employee.getEmp_ID());
//		System.out.println(empList.toString());
		for(Education e : empList) {
		eduid = e.getEmp_Edu_ID();
		}
//		System.out.println(id2);
		ModelAndView model=new ModelAndView();
//		List<Education> empList=request.getAttributeNames();
		
		if(eduid != 0) {
		model.setViewName("edudetails");
		model.addObject("empd", empList);
		}
		else {
			model.setViewName("education");
		}
		return model;
	}
	@RequestMapping(value = "/eduupdate2", method = RequestMethod.GET)
	public ModelAndView details(Model model) {
//		model.addAttribute("employee" ,new Employee());
		return new ModelAndView("eduupdate2");
	}
	
	 @RequestMapping(value = "/vieweducation/{emp_ID}")
	    public ModelAndView editEmployee(@SessionAttribute("empi")Employee employee)
	    {
		 Education edu = educationService.getDetails(employee.getEmp_ID());
		 System.out.println(edu.getInter_CollegeName());
	        ModelAndView model = new ModelAndView("eduupdate2");        
	        model.addObject("employ",edu);	      
	        return model;
	    }
	
	    /* It updates model object. */    
	    @RequestMapping(value="/updateeducation",method = RequestMethod.POST)    
	    public ModelAndView editsave(@ModelAttribute("education") Education education,@SessionAttribute("empi")Employee employee){
	        education.setEmp_ID(employee.getEmp_ID());
	        System.out.println(education.getEmp_ID());
	        educationService.update(education);    
	        return new ModelAndView("redirect:/profile");    
	    }    
	
	
	
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
	public ModelAndView profe(@SessionAttribute("empi")Employee employee) {
		int eduid = 0;
		List<EmployeeProfessional> empList=empProfService.employeeProfDetails(employee.getEmp_ID());
//		System.out.println(empList.toString());
		for(EmployeeProfessional e : empList) {
		eduid = e.getEmpl_ID();
		}
//		System.out.println(id2);
		ModelAndView model=new ModelAndView();		
		if(eduid != 0) {
		model.setViewName("professionaldetails");
		model.addObject("empp", empList);		
		}
		else {
			model.setViewName("professional");
		}
		return model;
	}


	@RequestMapping(value="/insertprofessional", method=RequestMethod.POST, headers = "Accept=application/json")
	
		public ModelAndView insertEduc(@SessionAttribute("empi")Employee employee,
		@RequestParam("previous_Company") String previous_Company,
		@RequestParam("salary") long salary,
		@RequestParam("role")  String role,
		@RequestParam("yearsOfExp") int yearsOfExp) {
		
		EmployeeProfessional empp= new EmployeeProfessional();
		empp.setEmpl_ID(employee.getEmp_ID());
		empp.setPrevious_Company(previous_Company);
		empp.setSalary(salary);
		empp.setRole(role);
		empp.setYearsOfExp(yearsOfExp);
		System.out.println(role);
		empProfService.insert(empp);
		return new ModelAndView("redirect:/profile");
		
}
		
	@RequestMapping(value="/viewprofessional/{empl_ID}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ModelAndView view2(@SessionAttribute("empi")Employee employee) {
		 
		EmployeeProfessional pro = empProfService.getProfessional(employee.getEmp_ID());
		
		ModelAndView model = new ModelAndView("profupdate");
		
		model.addObject("empp",pro);
//		model.setViewName("professional");
		return model;
	}
	
	@RequestMapping(value="/updateemployeeprofessional",method = RequestMethod.POST)    
    public ModelAndView updateEmployeeProfessional(@ModelAttribute("employeeProfessional") EmployeeProfessional employeeProfessional,
    		@SessionAttribute("empi")Employee employee){ 
		employeeProfessional.setEmpl_ID(employee.getEmp_ID());
        empProfService.update(employeeProfessional);    
        return new ModelAndView("redirect:/profile");    
    }  
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView login(Model model) {
//		model.addAttribute("employee" ,new Employee());
		return new ModelAndView("login");
	}


	
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login2(@RequestParam("uname") String email,@RequestParam("psw") String lastName, Model model,Employee emp) {
		
		int m=employeeService.validate(email, lastName);
		
//		System.out.println("Data" +m);// System.out.println(m);
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
//		model.addAttribute("employee" ,new Employee());
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





