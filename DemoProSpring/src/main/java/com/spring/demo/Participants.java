package com.spring.demo;

import org.aspectj.lang.ProceedingJoinPoint;

public class Participants {

	 
	String technology;
	
	
	public void takeSeat() {
		System.out.println("Taking seat");
	}
	public void switchOffPhones() {
		System.out.println("Switching Off There phones");
	}
	public void applaud() {
		System.out.println("Clap Clap Clap Clap");
	}
	public void claimRefund() {
		System.out.println("Boo Want claim Refund");
	}
	public void undergoTraining(ProceedingJoinPoint joinPoint) {
		{
			try {
				System.out.println("Taking seat");
				System.out.println("Switching Off There phones");
				long start=System.currentTimeMillis();
				joinPoint.proceed();
				long end=System.currentTimeMillis();
				System.out.println("Clap Clap Clap Clap");
				System.out.println("The Training took "+(end - start)+" milliseconds");
			} catch (Throwable e) {
				System.out.println("Boo Want claim Refund");
			}

		}
	}
	public void predictTraining(String technology) {
		System.out.println("Participants are predicting that training will train on "+technology );
	}
}
