package com.spring.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



public class MikadoSolutions implements TrainingCompany {
	@Autowired
	static MikadoSolutions mikado;
	@Autowired
	List<Trainer> trainers;
	@Autowired
	Set<Course> courses;
	
	
	private MikadoSolutions() {
	}
	public static MikadoSolutions getMikadoSolutions() {
		if(mikado==null) 
			mikado=new MikadoSolutions();
			return mikado;
	}
	

	


	@Override
	@Autowired
	public void conductTraining() {				
				Iterator<Trainer> it = trainers.iterator();
				while(it.hasNext()) {
					Trainer trainer=it.next();
					System.out.println(trainer);
					try {
						trainer.train();
					} catch (Exception e) {
						// TODO Auto-generated catch block
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
	@Override
	public String toString() {
		return "MikadoSolutions is a training company";
	}
	
	

}
