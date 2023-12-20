package com.accenture.lkm.Day3;

public class ConstructorEx {
	//instance varaible
	int num;

	// constructor overloading
	public ConstructorEx() {
		num = 20;
		System.out.println("Welcome to Accenture!! ");
	}

	public ConstructorEx(int a) {
		
		System.out.println(a * 2);
	}

	public ConstructorEx(char a) {
		System.out.println("Char value: " + a);
	}

	public ConstructorEx(int a, int b) {
		System.out.println(a + b);
	}
	public ConstructorEx(int a, char b) {
		System.out.println(a + b);
	}
	public ConstructorEx(char a, int b) {
		System.out.println(a + b);
	}
	

	// Methods

	void add() {
		//locla varaible
		int num1=99;
		System.out.println(num1);
		//System.out.println(++num);
	}

	void display() {
		System.out.println("Helloo LEarners ");
	}

	public static void main(String[] args) {
		new ConstructorEx(6);// parameterized constructor
		// constructors gets invoked
		ConstructorEx obj = new ConstructorEx();// no args constructor/non parameterized constructor
		// methods has to call explicitly
		obj.add();
		
		ConstructorEx obj3 = new ConstructorEx(8, 9);// parameterized constructor

	}

}
