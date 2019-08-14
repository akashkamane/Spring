package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MyController {
	
	
	@RequestMapping("/Index")
	public String Demo() {
		return "Display.jsp";
	}
	
	/*
	 * public ModelAndView User(String Name,String pass) {
	 * 
	 * ModelAndView mv=new ModelAndView();
	 * 
	 * Second s=new Second();
	 * 
	 * String str=s.printName();
	 * 
	 * 
	 * return mv;
	 * 
	 * }
	 */

}
