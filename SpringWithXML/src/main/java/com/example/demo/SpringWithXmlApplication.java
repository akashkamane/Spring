package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
@ImportResource("classPath:beanFileName.xml")
@ComponentScan("Give the package name") 
@SpringBootApplication
public class SpringWithXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithXmlApplication.class, args);
	}

}
