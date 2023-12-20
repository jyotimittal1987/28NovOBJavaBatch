package com.accenture.lkm.day5;

public class MethodOverloadingEx {

	void add() {
		System.out.println(10 + 5);
	}

	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(int a, double b) {
		System.out.println(a + b);
	}

	void add(double a, int b) {

	}

	public static void main(String[] args) {
		MethodOverloadingEx obj = new MethodOverloadingEx();
		//obj.add(7);
	}

}
