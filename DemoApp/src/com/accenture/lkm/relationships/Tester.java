package com.accenture.lkm.relationships;

public class Tester {
	public static void main(String[] args) {
		/*
		 * Customer c1=new Customer(); c1.setCustName("John");
		 * System.out.println("Customer NAme: "+ c1.getCustName());
		 * System.out.println("Customer Account No: "+c1.getAccount().getAccNo());
		 */
		Department d1 = new Department();
		d1.setDeptName("CS");
		Faculty fac = new Faculty();
		fac.setFacultyId(1001);
		fac.setFacultyName("Ryan");
		d1.setFac(fac);
		System.out.println(d1.getFac().getFacultyName());

	}

}
