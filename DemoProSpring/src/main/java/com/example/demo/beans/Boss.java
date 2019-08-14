package com.example.demo.beans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.DemoProSpringApplication;

@SpringBootApplication
public class Boss {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoProSpringApplication.class, args);
		Deven Apple=ctx.getBean(Apple.class);
		Apple.conductTraining();
		

	}

}
