package com.tyss.access.pack2;

import com.tyss.access.pack1.Student;

public class TestStudent extends Student {

	protected TestStudent(String name) {
		super(name);			
		}
	void studentDetails() {
		System.out.println("student name is:"+sName);
	}
	public static void main(String ar[]) {
		TestStudent s1=new TestStudent("Uday");
		s1.studentDetails();
		s1.studDetails();
	}
}
