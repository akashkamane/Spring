package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.demo.Employee;

public class LaunchTraining {
						
	public static void main(String[] args) {
		ApplicationContext context= new FileSystemXmlApplicationContext("C:\\Users\\AKASH\\git\\Spring\\DemoProSpring\\TrainingConfig.xml");
		//ConfigurableApplicationContext context= SpringApplication.run(LaunchTraining.class, args);
		Workshop trainingWorkshop=(Workshop)context.getBean("trainingWorkshop");
		trainingWorkshop.conductWorkshop();
		
		Employee emp=(Employee)context.getBean("Akash");
		System.out.println(emp.getSalary());
		
		MultiTechnologyTrainer trainer=(MultiTechnologyTrainer)context.getBean("Akash");
		trainer.train("Java");
		
		
		
				
	}

}
