package com.cgp.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap<Integer,Student> h1= new HashMap<Integer,Student>();
		h1.put(34, new Student(22,"Divya"));
		h1.put(45,new Student(24,"Shree"));
		h1.put(null, null);
		h1.put(null,new Student(45,"uday"));
		h1.put(34, new Student(89,"Divya"));
		
		Collection<Student> c1 = h1.values();

		for( Student s1:c1) {
			System.out.println(s1);
		}
		System.out.println(h1.containsKey(45));
		System.out.println(h1.containsValue(new Student(45,"uday")));
		System.out.println(h1.size());
		System.out.println(h1.isEmpty());
	}

}
