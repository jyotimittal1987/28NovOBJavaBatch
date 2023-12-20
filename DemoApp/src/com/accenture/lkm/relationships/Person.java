package com.accenture.lkm.relationships;

//parent class / base class / super class
public class Person {
	protected String name;
	int age;
	//final double pi=3.14;

	public Person() {
		System.out.println("Person class Constructor");
	}

	public Person(String name, int age) {
		//pi=455.7;
		this.name = name;
		this.age = age;
	}

	 void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

}
