package com.cgp.map.Treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> t1 = new TreeMap<Integer,String>();
		t1.put(34, "Sowmya");
		t1.put(12, "Uday pawar");
		t1.put(56, "Sanath");
		
		Set<Map.Entry<Integer,String>> s1 = t1.entrySet();
		
		for(Map.Entry<Integer,String> e1:s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("------------------------------");
		}
		System.out.println(t1.get(12));
		
		
	}

}
