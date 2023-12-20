package com.accenture.lkm.relationships;

//child class - sub class- derived class 
public class Employee extends Person {

	int empId;
	double salary;

	public Employee() {
		System.out.println("Employee class constructor");
	}

	public Employee(int empId, double salary, String name, int age) {
		super(name, age);
		this.empId = empId;
		this.salary = salary;

	}

	void accept() {
		empId = 405;
		salary = 230000;
		name = "Mohan";
		age = 45;

	}

	/*
	 * void displayEmpDetails() { System.out.println("Employee Id: " + empId);
	 * System.out.println("Employee salary: " + salary); display();
	 * 
	 * }
	 */
	// Overriden methodx
	@Override
	public void display() {
		super.display();
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee salary: " + salary);

	}

}
