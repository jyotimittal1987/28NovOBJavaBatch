package com.accenture.lkm.day5;

public class DivideByZero {
	int num1 = 10, num2 = 0;

	void div() {
		try {
			System.out.println(num1 / num2);
			int arr[] = { 10, 30, 50 };
			System.out.println(arr[3]);
		} /*
			 * catch (ArithmeticException e) {
			 * System.out.println("You are trying to divide no by zero." + e.getMessage());
			 * 
			 * }
			 */ catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			// System.out.println("Array Indexing does not exists" + e.getMessage());
			System.out.println("Exception Occured");
		} catch (Exception r) {
			System.out.println("There is an error . Pl try again");
		}
		finally
		{
			System.out.println("Closing the resources !");
		}
		System.out.println("At the end");
	}

	public static void main(String[] args) {
		DivideByZero obj = new DivideByZero();
		obj.div();

	}

}
