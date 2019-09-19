package com.spring.hibernate.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan({"com.spring.hibernate.mvc"})
@SpringBootApplication
@EntityScan
public class SpringBootSpringHibernateTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSpringHibernateTaskApplication.class, args);
	}

}
