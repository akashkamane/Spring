package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = { "com.demo"})


public class WebDemoApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(WebDemoApplication.class, args);
		
	}

}
