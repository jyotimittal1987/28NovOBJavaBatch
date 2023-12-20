package com.accenture.lkm;

import java.util.Scanner;

public class ConditionalEx {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		num=sc.nextInt();
		//even-odd logic
		if(num % 2 ==0)
		{
			System.out.println("No is even");
		}
		else
		{
			System.out.println("No is odd");
		}
		//+ve, -ve
		if(num>0)
		{
			System.out.println("No is +ve");
		}
		else if(num==0)
		{
			System.out.println("No is zero");
		}
		else
		{
			System.out.println("No is -ve");
		}
		
		
	}

}
