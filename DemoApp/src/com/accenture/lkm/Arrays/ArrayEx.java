package com.accenture.lkm.Arrays;

import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		int arr[] = new int[100];
		Scanner sc = new Scanner(System.in);
		/*
		 * arr[1]=34; arr[4]=66; System.out.println(arr[7]);
		 */
		System.out.println("Enter the size");
		int size = sc.nextInt();
		System.out.println("Enter the values in array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The values are :");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] * 4);
		}

	}

}
