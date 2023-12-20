package com.accenture.lkm.day5;

public class CustomExceptionTester {

	static void testEmployeeId(int id) throws InvalidEmployeeIdException {
		if (id == 0 || id < 0) {
          throw new InvalidEmployeeIdException("Invalid Employee Id");
		}
		System.out.println("Employee ID id Valid " + id);
	}
	public static void main(String[] args) {
		try {
			testEmployeeId(-56);
		} catch (InvalidEmployeeIdException e) {
			System.out.println(e.getMessage());
		}
	}

}
