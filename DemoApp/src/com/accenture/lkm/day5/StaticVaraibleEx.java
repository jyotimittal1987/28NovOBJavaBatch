package com.accenture.lkm.day5;

public class StaticVaraibleEx {
	static int count=0;
	
	static void inc()
	{
		count++;
		System.out.println(count);
	}
	void display() {
		System.out.println("Display Details");
	}
	public static void main(String[] args) {
		StaticVaraibleEx.inc();
		//StaticVaraibleEx obj=new StaticVaraibleEx();
		/*
		 * obj.inc();//count=1 obj.inc();//count=2 StaticVaraibleEx obj1=new
		 * StaticVaraibleEx();//count=0 obj1.inc();//count=1
		 */	}

}
