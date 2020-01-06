package com.nisum.corejava.collectionsframework;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueDemo {
	public static void main(String[] args) {
		 Deque<String> deque = new LinkedList<String>(); 
		 deque.add("Riyaz");
		 deque.addFirst("Rohit");
		 deque.addLast("Avinash"); 
		 deque.push("Syed");
	     deque.offer("Mudunuri"); 
	     deque.offerFirst("Uddin"); //adds First
	     deque.offerLast("Anvi");  //adds in the last
	     
		 System.out.println(deque);
		 
	}

}
