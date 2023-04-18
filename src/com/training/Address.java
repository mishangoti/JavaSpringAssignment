package com.training;

public class Address {
	String empCity;
	String empHouseNum;
	
	public Address(String empCity, String empHouseNum) {
		this.empCity = empCity;
		this.empHouseNum = empHouseNum;
	}
	
	void displayAddress() {
		System.out.println("Employee Home: " + empCity);
		System.out.println("Employee Home: " + empHouseNum);
	}
}

