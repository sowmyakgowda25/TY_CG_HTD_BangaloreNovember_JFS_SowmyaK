package com.io.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
	public static void main(String[] args) {
		try {
			FileOutputStream f1 = new FileOutputStream("uday.txt");
			
			String s1 = "Uday Pawar";
			byte[] b1=s1.getBytes();
			f1.write(b1);
			System.out.println("success....");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
