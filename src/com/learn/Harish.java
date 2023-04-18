package com.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("harish")
public class Harish implements Student{

	// field
	public Mishan mishan;
	@Autowired
	Harish(Mishan mishan) {
		this.mishan = mishan;
	}
	
	@Override
	public void getLearn() {
		// TODO Auto-generated method stub
		System.out.println("Harish is learning spring");
		mishan.getLearn();
	}
	
}
