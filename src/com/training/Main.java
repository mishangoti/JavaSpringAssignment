package com.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// regular object creation and instantiation method
		MyPhone mp = new SmartPhone();
		mp.calling();
		
		MyPhone kp = new KeyPadPhone();
		kp.calling();
		
		// process to use beans 
		// start IOC container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		// retrieve the beans from the xml file
		// Create an object of classes
		MyPhone mpBean = context.getBean("smart", MyPhone.class);
		MyPhone kpBean = context.getBean("key", KeyPadPhone.class);
		MyPhone mp1Bean = context.getBean("smart", MyPhone.class);

		// get hashcode 
		System.out.println(mpBean.hashCode());
		System.out.println(mp1Bean.hashCode());
		
		// call the relevent method
		mpBean.calling();
		kpBean.calling();
		
		// retrive employee bean
		// create an object of employee class
		Employee emp = context.getBean("emp", Employee.class);
		
		// call the relevent method
		emp.displayEmployee();
		
		// create an object of addess class
		Address add = context.getBean("add", Address.class);
		
		// call the relevent method
		add.displayAddress();
		
		// to close the IOC container
		context.close();
	}

}
