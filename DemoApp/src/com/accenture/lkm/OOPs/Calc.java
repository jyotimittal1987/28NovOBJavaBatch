package com.accenture.lkm.OOPs;

public class Calc {
	int num = 10;

//Method with no return type and no parameter
	void incByone() {
		System.out.println(++num);
	}

//Method with no return type and with parameter
	// parameters are temporary declaration
	void sub(int a, int b) {
		if (a > b) {
			System.out.println(a - b);
		} else {
			System.out.println(b - a);
		}
	}

	// Method with return type and with no parameter
	int div() {
		int result = num / 10;
		return result;
	}

//Method with return type and with parameter
	int add(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {
		// Calc- class name
		// c1- reference name
		// new - keyword to allocate memory
		Calc c1 = new Calc();
		// thorugh object, we are invoking methods of class
		//c1.incByone();
		//c1.sub(10, 40);// arguments
		int h=c1.div();
		System.out.println(h);
		System.out.println(c1.div());
		System.out.println(c1.add(7, 8));

	}

}
