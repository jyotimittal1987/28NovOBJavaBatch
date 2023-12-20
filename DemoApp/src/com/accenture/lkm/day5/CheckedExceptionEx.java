package com.accenture.lkm.day5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionEx {
	static void read() {
		try {
			FileReader fread = new FileReader("sample.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		read();
	}
}
