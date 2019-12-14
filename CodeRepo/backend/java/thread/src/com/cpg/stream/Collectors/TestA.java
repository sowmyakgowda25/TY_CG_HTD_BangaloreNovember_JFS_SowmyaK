package com.cpg.stream.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestA {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(24);
		a1.add(56);
		a1.add(75);
		a1.add(67);
		a1.add(100);
		a1.add(101);
		System.out.println("------------filter()---------------");
		List<Integer> l1 = a1.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(l1);
		System.out.println("-------------map()----------------");
		List<Integer> l2 = a1.stream().map(i -> i*100).collect(Collectors.toList());
		System.out.println(l2);
		System.out.println("--------------max()---------------");
		Optional<Integer> a = a1.stream().max((i,j) -> i.compareTo(j));
		System.out.println(a);
		System.out.println("----------------size-----------------");
		System.out.println(a1.stream().count());
	}

}
