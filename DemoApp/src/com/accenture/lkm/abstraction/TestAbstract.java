package com.accenture.lkm.abstraction;

public class TestAbstract {
	public static void main(String[] args) {
		// RBI obj=new RBI();
		AxisBank axis = new AxisBank();
		axis.deposit();
		axis.getRateOfInterest();
	}
}
