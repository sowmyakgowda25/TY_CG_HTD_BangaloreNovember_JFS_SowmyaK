package com.cgp.map.Treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap3{
	public static void main(String[] args) {
		
		ArrayList<Student3> a1 = new ArrayList<Student3>();
		a1.add(new Student3(11,"Uday"));
		a1.add(new Student3(12,"raju"));
		a1.add(new Student3(13,"sonu"));
		
		ArrayList<Student3> a2 = new ArrayList<Student3>();
		a2.add(new Student3(11,"sanu"));
		a2.add(new Student3(12,"ravi"));
		
		TreeMap<String,ArrayList<Student3>> t1 = new TreeMap<String,ArrayList<Student3>>();
		t1.put("BE",a1);
		t1.put("10th std",a2);
		//t1.put("BA",a2);
		
		System.out.println(t1.get("BE"));
		
Set<Map.Entry<String,ArrayList<Student3>>> s1 = t1.entrySet();
		
		for(Map.Entry<String,ArrayList<Student3>> e1:s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("------------------------------");
		}
	}
}
