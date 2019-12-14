package com.cpg.Map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHMap1 {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> l1= new LinkedHashMap<String, Integer>();
		
		l1.put("Rajajinag1ar", 560012);
		l1.put("Btm", 576008);
		l1.put("BTR", 560089);
		l1.put(null, null);
		l1.put("hebbal", null);
		l1.remove("Btm");
		
		Set<Map.Entry<String, Integer>>s1 = l1.entrySet();
		
		for(Map.Entry<String, Integer> e1:s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("--------------------------");
		}
	}

}
