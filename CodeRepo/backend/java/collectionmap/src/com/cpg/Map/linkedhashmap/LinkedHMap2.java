package com.cpg.Map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHMap2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Employee> l1= new LinkedHashMap<Integer,Employee>();
		
		l1.put(34, new Employee(23000,"sowmya"));
		l1.put(56, new Employee(39000,"uday"));
		l1.put(25, new Employee(43000,"pawar"));
		
		System.out.println(l1.get(56));
		
		Set<Entry<Integer,Employee>> s1 = l1.entrySet();
		for(Map.Entry<Integer,Employee> e1:s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("--------------------------------------");
		}
		System.out.println(l1.containsKey(34));
		System.out.println(l1.containsValue(new Employee(39000,"uday")));
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
	}

}
