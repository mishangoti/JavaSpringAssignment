package com.learn;

import org.springframework.stereotype.Component;

@Component("mishan")
public class Mishan implements Student{
	public void getLearn() {
		// TODO Auto-generated method stub
		System.out.println("Harish is learning spring");
	}
}
