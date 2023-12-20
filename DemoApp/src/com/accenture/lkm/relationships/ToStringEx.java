package com.accenture.lkm.relationships;

public class ToStringEx {
	String name;
	int age;

	public ToStringEx() {
		name = "Test1";
		age = 23;
	}
	
    
	public String toString() {
		return "name=" + name + ", age=" + age;
	}


	public static void main(String[] args) {
		ToStringEx obj=new ToStringEx();
		/*
		 * System.out.println(obj.age); System.out.println(obj.name);
		 */
		System.out.println(obj.toString());
	}

}
