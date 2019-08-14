package com.spring.demo;

public class TrainingWorkshop implements Workshop {
	
	TrainingCompany trainingCompany;

	public TrainingWorkshop() {
	
	}

	public TrainingWorkshop(TrainingCompany trainingCompany) {
		
		this.trainingCompany = trainingCompany;
	}

	public TrainingCompany getTrainingCompany() {
		return trainingCompany;
	}

	public void settrainingCompany(TrainingCompany trainingCompany) {
		this.trainingCompany = trainingCompany;
	}


	
	public void conductWorkshop() {
		System.out.println(trainingCompany);
		
		trainingCompany.conductTraining();
	}
	
	

}
