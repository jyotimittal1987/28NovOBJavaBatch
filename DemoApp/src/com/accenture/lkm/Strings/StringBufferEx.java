package com.accenture.lkm.Strings;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
	//	StringBuffer sb=new StringBuffer();
		sb.append("Hii");
		sb.append(" How are you");
		System.out.println(sb);
		sb.insert(1, "Halo");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(2, 4);
		System.out.println(sb);
	}

}
