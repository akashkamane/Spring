package com.spring.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AdministratorBaen implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean,String beanName)
	throws  BeansException {
		System.out.println("About to initialize Bean : "+beanName);
		return bean;
		
	}
	public Object postProcessAfterInitialization(Object bean,String beanName)
			throws  BeansException {
				System.out.println("initialized Bean : "+beanName);
				if (bean instanceof AndroidTrainer) {
					AndroidTrainer androidTrainer=(AndroidTrainer)bean;
					AndroidTrainerWrapper wrapper=new AndroidTrainerWrapper(androidTrainer);
					
							return wrapper;
				}
				else {
					return bean;
				}
				
			}

}
