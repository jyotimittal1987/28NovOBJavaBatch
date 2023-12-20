package com.accenture.lkm.Day3;

public class GetterSetter {
	private int num1, num2;// instance variable

	public int getNum1() {
		return num1;
	}

	// parameter
	public void setNum1(int num1) {
		// num1=a;
		// num1=num1;
		// this is keyword to resolve the ambiguity
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

}
