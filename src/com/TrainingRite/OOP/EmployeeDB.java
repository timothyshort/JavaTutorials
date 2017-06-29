package com.TrainingRite.OOP;

public class EmployeeDB {

	public static void main(String[] args) {
		// Create an employee
		// Employee will have properties and methods
		Employee emp1 = new Employee();
		
		/* BAD Practice
		emp1.name = "Harry";
		emp1.phoneNumber = "45645665";
		*/
		
		// ENCAPSULATE
		emp1.setName("Harry");
		System.out.println("My name is " + emp1.getName());
		emp1.setPhoneNumber("4563214567");
		System.out.println("My phone number is " + emp1.getPhoneNumber());
	}

}

class Employee {
	// Properties / Variables / Adjectives
	private String name;
	private String phoneNumber;
	private int ID;
	private double wage;
	
	// Getters & Setters
	public void setName(String pName) {
		System.out.println("Setting the property for NAME");
		name = pName;
	}
	public String getName() {
		System.out.println("Getting the property for NAME");
		return name;
	}
	public void setPhoneNumber(String phoneNumber) {
		System.out.println("Setting the property for PHONE NUMBER");
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		System.out.println("Getting the property for PHONE NUMBER");
		return phoneNumber;
	}
	
	// Methods
	public void work() {
		
	}
	public void getPaid() {
		
	}
}
