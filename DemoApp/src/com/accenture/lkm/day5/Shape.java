package com.accenture.lkm.day5;

public class Shape {
	double width, height, area;

	void draw() {
		System.out.println("Drwaing Shapes");
	}

}

class Square extends Shape {
	/*
	 * void draw() { System.out.println("Drawing square shape"); }
	 */

	void calcArea(double size) {
		System.out.println(size * size);

	}

}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing Rectangle shape");
	}

	void calcArea(double w, double h) {
		width = w;
		height = h;
		System.out.println(width * height);

	}

}
