package com.javapractice.corejava.collectionsframework;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		

		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.offer("A");
		pq.offer("D");
		pq.offer("C");
		pq.offer("B");
		System.out.println(pq);
		
		//deletes in sorted order
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);

	}

}
