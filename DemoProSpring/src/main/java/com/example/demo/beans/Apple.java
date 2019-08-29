package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Apple implements Deven {
	@Autowired
	Samsung samsung;
	
	  public Apple() {
	  
	  }
	  
	  
	  
	  
	  public Apple(Samsung samsung) { this.samsung = samsung; }
	  
	  
	  public Samsung getSamsung() { return samsung; }
	  
	  
	  public void setSamsung(Samsung samsung) { this.samsung = samsung; }

	public void conductTraining() {
		System.out.println(samsung);
		samsung.conductTraining();
	}


}
