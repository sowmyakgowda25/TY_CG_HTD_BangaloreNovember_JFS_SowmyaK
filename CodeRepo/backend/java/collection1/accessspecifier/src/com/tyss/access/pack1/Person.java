package com.tyss.access.pack1;

public class Person {
	public String name;
	public static int age;
	
	public Person(String name,int age) {
			this.name=name;
			this.age=age;
	}
	public void personDetails() {
		System.out.println("person name is "+name);
		System.out.println("person age is "+age);
	}

}
