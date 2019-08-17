package com.spring.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;



public class MikadoSolutions implements TrainingCompany {
	//@Autowired
	static MikadoSolutions mikado;
	//@Autowired
	List<Trainer> trainers;
	//@Autowired
	Set<Course> courses;
	//@Autowired
	Map<Course,Trainer> courseTrainers;
	
	
	public static MikadoSolutions getMikado() {
		return mikado;
	}
	public static void setMikado(MikadoSolutions mikado) {
		MikadoSolutions.mikado = mikado;
	}
	public Map<Course, Trainer> getCourseTrainers() {
		return courseTrainers;
	}
	public void setCourseTrainers(Map<Course, Trainer> courseTrainers) {
		this.courseTrainers = courseTrainers;
	}
	private MikadoSolutions() {
	}
	public static MikadoSolutions getMikadoSolutions() {
		if(mikado==null) 
			mikado=new MikadoSolutions();
			return mikado;
	}
	

	


	//@Autowired
	public void conductTraining() {				
				Iterator<Trainer> it = trainers.iterator();
				while(it.hasNext()) {
					Trainer trainer=it.next();
					System.out.println(trainer);
					try {
						trainer.train();
					} catch (Exception e) {
						
						//System.out.println(e);
					}
					}
	}
	public List<Trainer> getTrainers() {
		return trainers;
	}
	public void setTrainers(List<Trainer> trainers) {
		this.trainers = trainers;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	public String toString() {
		return "MikadoSolutions is a training company";
	}
	
	

}
