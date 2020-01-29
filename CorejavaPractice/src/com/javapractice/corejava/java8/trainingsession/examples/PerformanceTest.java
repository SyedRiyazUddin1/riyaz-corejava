//Performance test between Sequential stream and parallel stream.

package com.javapractice.corejava.java8.trainingsession.examples;

import java.util.ArrayList;
import java.util.List;

public class PerformanceTest {
	public static void main(String[] args) {
		
		//creating two different lists below
		List<Integer> myList1 = new ArrayList<Integer>();
		List<Integer> myList2 = new ArrayList<Integer>();
		for (int i = 0; i < 1000000; i++) {
			myList1.add(i);
		}

		long startTime = System.currentTimeMillis();
		myList1.stream().forEach(num -> myList2.add(num)); //adding myList1 in myList2
		long endTime = System.currentTimeMillis(); //

		//calculating the total time taken by sequential stream.
		System.out.println("Total time taken by sequential stream = " + (endTime - startTime)); 

		//Clearing myList2 so that we can add myList1 in myList2 again 
		myList2.clear();

		startTime = System.currentTimeMillis();
		myList1.parallelStream().forEach(num -> myList2.add(num));
		endTime = System.currentTimeMillis();
		System.out.println("Total time taken by parallel stream = " + (endTime - startTime));

	}

}
