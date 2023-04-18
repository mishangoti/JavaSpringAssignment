package com.springtask1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.MyPhone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// process to use beans 
		// start IOC container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springtask1.config.xml");
		
		// retrieve the beans from the xml file
		// Create an object of classes
		JavaWorld jwBean = context.getBean("framework", JavaWorld.class);
		
		// call the relevent method
		jwBean.learningJava();
		
		// to close the IOC container
		context.close();
	}

}
