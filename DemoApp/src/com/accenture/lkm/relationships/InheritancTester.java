package com.accenture.lkm.relationships;

public class InheritancTester {
	public static void main(String[] args) {
		/*
		 * Employee emp1=new Employee(); emp1.accept(); emp1.display();
		 */
		// emp1.displayEmpDetails();
		/*
		 * Manager m1 = new Manager(); m1.setNoOfReportees(5); m1.display();
		 */
		Employee e1=new Employee(101,23000,"Mona",44);
		e1.display();
		e1=null;
		//System.out.println(e1.age);//NullPointerException
		System.gc();//Garbage collector Method which runs the garbage collection process and release memory of unused / unreferenced objects 
		
		
		

	}

}
