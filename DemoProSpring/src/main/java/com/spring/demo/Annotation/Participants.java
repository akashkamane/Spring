package com.spring.demo.Annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Participants {

	 @Pointcut("execution(* com.spring.demo.JavaTrainer.train(..))")
	 public void training() {
		 
	 }
		String technology;
		
		@Before("training()")
		public void takeSeat() {
			System.out.println("Taking seat");
		}
		@Before("training()")
		public void switchOffPhones() {
			System.out.println("Switching Off There phones");
		}
		@AfterReturning("training()")
		public void applaud() {
			System.out.println("Clap Clap Clap Clap");
		}
		@AfterThrowing("training()")
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
