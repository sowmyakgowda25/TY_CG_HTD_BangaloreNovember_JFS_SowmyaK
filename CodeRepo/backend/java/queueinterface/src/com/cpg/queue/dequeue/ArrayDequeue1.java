package com.cpg.queue.dequeue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeue1 {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> a1 = new ArrayDeque<Integer>();
		
		a1.add(23);
		a1.add(2);
		a1.add(45);
		a1.add(34);
		a1.add(76);
		a1.add(2);
		
		Iterator<Integer> itr = a1.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		System.out.println("-------------------------");
		a1.addFirst(90);
		a1.addLast(100);
		System.out.println(a1);
		System.out.println("-----------------------------");
		a1.getFirst();
		a1.getLast();
		System.out.println("-----------------------------");
		a1.remove();
		a1.removeFirst();
		System.out.println(a1);
		a1.removeLast();
		System.out.println(a1);
		a1.removeFirstOccurrence(2);
		System.out.println(a1);
		a1.removeLastOccurrence(2);
		System.out.println(a1);
		System.out.println("-----------------------------");
		a1.peek();
		System.out.println(a1);
		a1.poll();
		System.out.println(a1);
		System.out.println("-----------------------------");

		a1.offer(450);
		System.out.println(a1);
		a1.push(999);
		System.out.println(a1);
		a1.pop();
		System.out.println("-----------------------------");

		System.out.println(a1);
		a1.element();
		System.out.println(a1);
		}

}
