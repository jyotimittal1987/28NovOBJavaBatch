package com.accenture.lkm.day5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException2 {
	static void read() throws FileNotFoundException,IOException {

		FileReader fread = new FileReader("sample.txt");

	}
	public static void main(String[] args) {
		try {
			read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
