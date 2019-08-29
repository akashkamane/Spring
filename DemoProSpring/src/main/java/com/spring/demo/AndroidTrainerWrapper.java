package com.spring.demo;

import java.util.Set;

public class AndroidTrainerWrapper implements Trainer {
	AndroidTrainer androidTrainer;
	public AndroidTrainerWrapper(AndroidTrainer androidTrainer) {
		this.androidTrainer=androidTrainer;
	}

	
	public void train() throws Exception {
		Participants participants=new Participants();
		participants.takeSeat();
		participants.switchOffPhones();
		try {
			androidTrainer.train();
			participants.applaud();
		} catch (Exception e) {
			participants.claimRefund();
		}
		
	}

	
	public Set<String> getSpecialties() {
		return androidTrainer.getSpecialties();
	}

}
