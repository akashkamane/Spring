package com.spring.demo;

import java.util.Set;

public class JavaDotNetTrainer implements MultiTechnologyTrainer {
String name;
Set<String> specialties;


	public JavaDotNetTrainer() {
	
}

	
	public JavaDotNetTrainer(String name, Set<String> specialties) {
		super();
		this.name = name;
		this.specialties = specialties;
	}

	public void train(String technology) {
		System.out.println(name+"is training on"+technology);
	}


	public void train() throws Exception {
		train("Java");
	}

	public Set<String> getSpecialties() {
		// TODO Auto-generated method stub
		return specialties;
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


	
	public String toString() {
		return "JavaDotNetTrainer [name=" + name + ", specialties=" + specialties + "]";
	}
	
	
	

	
}
