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
		JavaWorld jwBean = context.getBean("framework-java", JavaWorld.class);
		
		// call the relevent method
		System.out.println(jwBean.learningJava());
		
		// other way or best practice
		// JavaLanguage
		JavaLanguage javaWorld = (JavaLanguage) context.getBean("framework-java");
		System.out.println(javaWorld.learningJava());
		
		// PythonLanguage
		PythonLanguage pythonWorld = (PythonLanguage) context.getBean("framework-python");
		System.out.println("Injected JavaWorld in to PythonWorld class as dependency" + pythonWorld.learningPython());
        
        // Get the JavaWorld bean from the application context
		JavaScriptWorld javaScriptWorld = context.getBean(JavaScriptWorld.class);

        // Call the learningJava() method on the JavaWorld bean and print the result
        System.out.println("Create a bean of a JavaScriptWorld class using\r\n"
        		+ "“@Component” annotation." + javaScriptWorld.learningJavaScript());
		
		// to close the IOC container
		context.close();
	}

}
