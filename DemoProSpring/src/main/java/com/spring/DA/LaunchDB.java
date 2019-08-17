package com.spring.DA;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class LaunchDB {
	public static void main(String[] args) {
		ApplicationContext context= new FileSystemXmlApplicationContext("C:\\Users\\AKASH\\git\\Spring\\DemoProSpring\\TrainingConfig.xml");
		EmployeeeDAO dao=(EmployeeeDAO)context.getBean("employeedao");
		List<Employee> emp=(List<Employee>)dao.getAllEmployees();
		System.out.println(emp);
	}
}
