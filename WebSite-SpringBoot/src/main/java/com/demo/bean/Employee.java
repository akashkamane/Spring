package com.demo.bean;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;



@Entity
@Table(appliesTo="HEmployee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="first_name")
	   private String firstName; 
	@Column(name="last_name")
	   private String lastName; 
	@Column(name="Salary")
	   private int salary;  

	   public Employee() {}
	   public Employee(String fname, String lname, int salary) {
	      this.firstName = fname;
	      this.lastName = lname;
	      this.salary = salary;
	   }
	   
	   public int getId() {
	      return id;
	   }
	   
	   public void setId( int id ) {
	      this.id = id;
	   }
	   
	   public String getFirstName() {
	      return firstName;
	   }
	   
	   public void setFirstName( String first_name ) {
	      this.firstName = first_name;
	   }
	   
	   public String getLastName() {
	      return lastName;
	   }
	   
	   public void setLastName( String last_name ) {
	      this.lastName = last_name;
	   }
	   
	   public int getSalary() {
	      return salary;
	   }
	   
	   public void setSalary( int salary ) {
	      this.salary = salary;
	   }
	}			