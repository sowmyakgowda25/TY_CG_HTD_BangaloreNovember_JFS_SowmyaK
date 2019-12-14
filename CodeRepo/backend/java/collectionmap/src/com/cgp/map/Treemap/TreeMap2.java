package com.cgp.map.Treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		TreeMap<Student,String> t1 = new TreeMap<Student,String>();
		
		t1.put(new Student(6,"Uday"), "1st standard");
		t1.put(new Student(14,"Sowmya"), "8th standard");
		t1.put(new Student(7,"Pawar"), "2nd standard");
		
		
		Set<Map.Entry<Student,String>> s1 = t1.entrySet();
		
		for(Map.Entry<Student,String> e1:s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-----------------------------");
		}
		System.out.println(t1.get(new Student(6,"Uday")));
	}

}
