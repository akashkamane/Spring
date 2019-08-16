package com.spring.demo;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class JavaTrainer implements Trainer {
@Autowired
String name;
@Autowired
Set<String> specialties;


	public JavaTrainer() {
	
}


	public JavaTrainer(String name, Set<String> specialties) {
	
	this.name = name;
	this.specialties = specialties;
}
	

	@Override
	public void train() throws Exception {
		if (Math.random()<0.5) 
			System.out.println(name + "is a java Trainer");
			else
				throw new Exception();

	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setSpecialties(Set<String> specialties) {
		this.specialties = specialties;
	}


	
	public Set<String> getSpecialties() {
		return specialties;
		
	}


	@Override
	public String toString() {
		return name+"is a JavaTrainer verygood";
	}
	

}
