
///* Test class for the Java Supplier interface example */

package com.javapractice.corejava.java8.examples;

import java.util.function.Supplier;
import java.util.*;

class RandomDigitSupplier implements Supplier {

	@Override
	public Integer get() {
		Integer i = new Random().nextInt(10);
		return i;
	}
}

public class SupplierExample {	

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			RandomDigitSupplier rds = new RandomDigitSupplier();
			int randomDigit = rds.get();
			System.out.print(randomDigit + " :: ");
		}
	}
}

//Program with Lambda expression:

//public class SupplierExampleRunner {
//
//  public static void main(String[] args) {
//    for (int i = 0; i<10; i++) {
//      //RandomDigitSupplier rds = new RandomDigitSupplier();
//      Supplier<Integer> rds = () -> new Random().nextInt(10);
//      int randomDigit = rds.get();
//      System.out.print(randomDigit + " :: " );
//    }
//  }
//}
