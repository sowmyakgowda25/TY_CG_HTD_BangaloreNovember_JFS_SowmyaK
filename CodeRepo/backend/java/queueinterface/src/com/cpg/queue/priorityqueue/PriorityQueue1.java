package com.cpg.queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		Queue p1 = new PriorityQueue();
		
		p1.offer(12);
		p1.offer(45);
		p1.offer(56);
		p1.offer(100);
		p1.offer(2);
		p1.offer(98);
		
		System.out.println(p1);
		System.out.println("-------------poll--------------");
		p1.poll();
		p1.poll();
		p1.remove();//same as poll()
		System.out.println(p1);
		System.out.println("-----------peek-------------");
		System.out.println(p1.peek());
		System.out.println("---------element-------------");
		System.out.println(p1.element());
		System.out.println("-----------------------------");
		for(Object o1:p1) {
			System.out.println(o1);
		}
	}

}

