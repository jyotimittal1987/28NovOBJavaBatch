package com.accenture.lkm;

import java.util.Scanner;

public class SwicthCaseEx {
	public static void main(String[] args) {
		int choice;
		char ch;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("Enter your choice 1.Add 2.Sub..");
		
		choice=sc.nextInt();
		System.out.println("Enter 2 no");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println(num1+num2);break;
		case 2: System.out.println(num1-num2);break;
		default :System.out.println("Invalid choice. Try again");
		
		}
		System.out.println("Do you want to continue?y/n");
		ch=sc.next().charAt(0);
		}while(ch=='y'|| ch=='Y');
	}

}
