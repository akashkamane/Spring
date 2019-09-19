package com.spring.hibernate.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.hibernate.mvc.bean.Employee;
import com.spring.hibernate.mvc.service.EmployeeService;

@RequestMapping("/home")
@RestController
public class MyController {
	
	@Autowired 
	private EmployeeService emp;
	
	@PostMapping("/Index")
	public ModelAndView Index() {
	ModelAndView mv = new ModelAndView();
	//mv.addObject("Employee", "cart");  
	System.out.println("hello");
	mv.setViewName("cart");	
	//return new ModelAndView("cart");	
	return mv;
	}
	 
	
	@PostMapping("/add")
	public ModelAndView User(Employee employee) {
		
		ModelAndView mv = new ModelAndView();		
		Employee e = emp.save(employee);
		mv.addObject("Employees", e);		
		mv.setViewName("cart");				  
			return mv; 
		}
}
/*
 * @RequestMapping(value="/add",params="search",method=RequestMethod.GET) public
 * ModelAndView search() { ModelAndView mv = new ModelAndView();
 * 
 * mv.addObject("Employee", "cart");
 * 
 * mv.setViewName("catlog"); System.out.println("CATLOG");
 * 
 * return mv;
 * 
 * }
 * 
 * @RequestMapping(value="/search",params="Abovebutton",method=RequestMethod.
 * POST) public ModelAndView Above(@RequestParam Double SALARY) { ModelAndView
 * mv = new ModelAndView(); //Fetch above=new Fetch(); //
 * empDao.gtEmployees(SALARY); mv.addObject(SALARY); mv.setViewName("catlog");
 * 
 * return mv; }
 * 
 * @RequestMapping(value="/add",params="Belowbutton",method=RequestMethod.POST)
 * public ModelAndView Below(@RequestParam Double SALARY) { ModelAndView mv =
 * new ModelAndView(); //Fetch above=new Fetch();
 * 
 * mv.addObject("salary", "empDao.ltEmployees(SALARY)");
 * mv.setViewName("catlog");
 * 
 * return mv; } }
 */
