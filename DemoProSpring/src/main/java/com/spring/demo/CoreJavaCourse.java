package com.spring.demo;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class CoreJavaCourse implements Course {
	
	List<String> courseContents;
	int courseDuration;
	double courseFees;
	public CoreJavaCourse() {
		
	}
	public CoreJavaCourse(List<String> courseContents, int courseDuration, double courseFees) {
		super();
		this.courseContents = courseContents;
		this.courseDuration = courseDuration;
		this.courseFees = courseFees;
	}
	public List<String> getCourseContents() {
		return courseContents;
	}
	public void setCourseContents(List<String> courseContents) {
		this.courseContents = courseContents;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	public double getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}
	@Override
	public String toString() {
		return "CoreJavaCourse " +courseContents+" duration is "+courseDuration+" Fees is "+courseFees;
	}
	

}
