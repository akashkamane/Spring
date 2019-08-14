package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LaunchTraining {
						
	public static void main(String[] args) {
		ApplicationContext context= new FileSystemXmlApplicationContext("C:\\Users\\AKASH\\git\\Spring\\DemoProSpring\\TrainingConfig.xml");
		//ConfigurableApplicationContext context= SpringApplication.run(LaunchTraining.class, args);
		Workshop trainingWorkshop=(Workshop)context.getBean("trainingWorkshop");
		CoreJavaCourse c1=(CoreJavaCourse)context.getBean("coreJavaCourse");

		CoreJavaCourse c2=(CoreJavaCourse)context.getBean("coreJavaCourse");
		
		System.out.println(c1==c2);
		
		trainingWorkshop.conductWorkshop();
		
		
		
		
	}

}
