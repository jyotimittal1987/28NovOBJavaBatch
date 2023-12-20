package com.accenture.lkm.day5;

public class Tester {
	public static void main(String[] args) {
		/*
		 * Square s1 = new Square(); s1.calcArea(3.4);
		 */
		// upcasting
		Shape s = new Square();
		s.draw();
		// s.calcArea(21.8);
		s = new Rectangle();
		s.draw();
		// downcasting
		Rectangle r1 = (Rectangle) s;

		r1.calcArea(2.3, 5.6);

	}

}
