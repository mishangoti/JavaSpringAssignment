package com.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// start IOC container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appconfig.xml");
		
		Student s = (Student) context.getBean("harish");
		s.getLearn();
		context.close();
	}

}
