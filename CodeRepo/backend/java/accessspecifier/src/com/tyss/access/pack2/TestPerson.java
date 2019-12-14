package com.tyss.access.pack2;

import com.tyss.access.pack1.Person;
import static com.tyss.access.pack1.Person.*;
public class TestPerson {
	public static void main(String arr[]) {
		System.out.println("age is "+age);
		Person p1=new Person("Uday",28);
		p1.personDetails();
	}
}
