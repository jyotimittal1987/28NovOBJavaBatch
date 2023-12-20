package com.accenture.lkm.abstraction;

public abstract class RBI {
	private double rateOfInterest = 0.05;

	public RBI() {
		System.out.println("Welcome to Bank");
	}

	double getRateOfInterest()
	{
		return rateOfInterest;
	}
	abstract void withdraw();

	abstract void deposit();

}
