package com.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.demo.bean.Employee;


@RestController

public class WebInitializer {
	
	Employee employee1;

	@RequestMapping("/")
	public String m1() {
	System.out.println("hello");
	return "cart";
	}
	
	@RequestMapping("WebLogin")
	public String m2() {
		
		employee1=new Employee("Shweta","Pawar",130000);
		employeeService.addEmployee(employee1);
		
	    //Integer id1=me.addEmployee(employee1);
	    System.out.println(employee1);
		
		return "catlog";
		}
	
	
	
	
	
	
}
