package com.accenture.lkm.OOPs;

import java.util.Scanner;

public class Employee {
	// properties / attributes / instance variable of class
	int empId;
	String name;
	int contactNo;
	double salary;
	Scanner sc = new Scanner(System.in);
	// Behaviour- methods

	void acceptEmpDetails() {
    System.out.println("Enter Employee Details");
    empId=sc.nextInt();
    contactNo=sc.nextInt();
    salary=sc.nextDouble();
    name=sc.next();
	}

	void displayEmpDetails() {
		System.out.println("======================");
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Salary:"+calculateBonus());

	}

	double calculateBonus() {
		return (salary+(salary*.01));

	}

}
