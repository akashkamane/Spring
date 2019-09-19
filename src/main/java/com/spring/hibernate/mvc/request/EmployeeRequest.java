package com.spring.hibernate.mvc.request;

public class EmployeeRequest {
	
	private Integer id;
	private String firstName; 
	private String Email;
	private double SALARY;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public double getSALARY() {
		return SALARY;
	}
	public void setSALARY(double sALARY) {
		SALARY = sALARY;
	}
	

}
