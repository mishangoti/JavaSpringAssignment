package com.springtask1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.MyPhone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// process to use beans 
		// start IOC container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springtask1config.xml");
		
		// retrieve the beans from the xml file
		// Create an object of classes
//		JavaWorld jwBean = context.getBean("framework-java", JavaWorld.class);
		
		// call the relevent method
//		jwBean.learningJava();
		
		// other way or best practice
		// JavaLanguage
//		JavaLanguage javaWorld = (JavaLanguage) context.getBean("framework-java");
//		javaWorld.learningJava();
		
		// PythonLanguage
		PythonLanguage pythonWorld = (PythonLanguage) context.getBean("framework-python");
		System.out.println(pythonWorld.learningPython());
		// to close the IOC container
		context.close();
	}

}
