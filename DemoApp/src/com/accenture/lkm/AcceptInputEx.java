package com.accenture.lkm;

import java.util.Scanner;

public class AcceptInputEx {
	public static void main(String[] args) {
		//sc is the object name for Scanner class
		//new is the keyword to allocate the memory to Scanner class
		Scanner sc=new Scanner(System.in);
		int num;
		char ch;
		System.out.println("Enter a number");
		num=sc.nextInt();
		System.out.println(num*5);
		System.out.println("Enter a character");
		ch=sc.next().charAt(0);
		//Typecasting 
		System.out.println("The enetered char is "+(int)ch);
		
	}

}
