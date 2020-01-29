package com.javapractice.corejava.java8.examples;

import java.util.Arrays;
import java.util.List;

class ForEachDemo {
	public static void main(String []args) {
		List<Integer> values = Arrays.asList(1,2,3);
		
		/* Java 7 implementation 
		 * 
		 * #method 1 
		 * for (int i=0;i<values.size();i++) {
		 * System.out.println(values.get(i)); 
		 * } 
		 * 
		 * OR
		 * 
		 * #method2 
		 * (Enhanced for loop)
		 * for(int i: values) {
		 * System.out.println(i); 
		 * }
		 */
		
		
		/* Java 8 
		 * Using ForEach loop (internal loop introduced in Java 8 along with lambda expression
		 */
		values.forEach(i -> System.out.println(i));
	}
}
