package com.accenture.lkm.Strings;

public class StringEx {
	public static void main(String[] args) {
		String s1="Welcome";
		String s2="welcome";
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.concat(" TO Accenture"));
		System.out.println(s1.contains("We"));
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
	}

}
