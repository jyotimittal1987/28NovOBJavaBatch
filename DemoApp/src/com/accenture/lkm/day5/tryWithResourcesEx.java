package com.accenture.lkm.day5;

import java.util.Scanner;

public class tryWithResourcesEx {
	int num1 = 10, num2 = 2;

	void test() {
		// Scanner implements Autocloseable (Interface-close())
		// Scanner sc=new Scanner(System.in);
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println(num1 / num2);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// sc.close();
		}
	}

}
