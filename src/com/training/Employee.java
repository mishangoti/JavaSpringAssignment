package com.training;

public class Employee {
	String empName;
	int empId;
	
	// inject address object in employee class
	// create an address field 
	Address address;
	
	// constructor
	public Employee(String empName, int empId, Address address) {
		this.empName = empName;
		this.empId = empId;
		this.address = address;
	}
	
	void displayEmployee() {
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Citu: " + address.empCity);
		System.out.println("Employee Home Num: " + address.empHouseNum);
	}
}
