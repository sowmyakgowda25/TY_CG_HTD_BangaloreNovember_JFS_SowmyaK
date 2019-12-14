package com.tyss.access.pack1;

public class Student {
	protected String sName;
	
	protected Student(String name) {
		sName=name;
	}
	protected void studDetails() {
		System.out.println("student name is:"+sName);
	}
}
