package com.accenture.lkm.relationships;

public class Manager extends Employee {
	private int noOfReportees;

	public int getNoOfReportees() {
		return noOfReportees;
	}

	public void setNoOfReportees(int noOfReportees) {
		this.noOfReportees = noOfReportees;
	}

	public void display() {
		accept();
		super.display();
		System.out.println("No odf Reportees: " + noOfReportees);

	}

}
