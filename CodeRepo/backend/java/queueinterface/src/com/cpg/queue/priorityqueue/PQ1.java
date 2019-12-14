package com.cpg.queue.priorityqueue;

import java.util.PriorityQueue;

public class PQ1 {
	public static void main(String[] args) {
		PriorityQueue<Student> p1 = new PriorityQueue<Student>();
		
		p1.offer(new Student(28,"uday"));
		p1.offer(new Student(23,"sowmya"));
		p1.offer(new Student(28,"uday"));
		
		for(Object o1:p1) {
			System.out.println(o1);
		}
	}
}
