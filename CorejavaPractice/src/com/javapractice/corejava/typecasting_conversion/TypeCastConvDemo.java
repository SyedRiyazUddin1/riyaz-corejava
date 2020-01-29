//Typecasting and type conversion program
package com.javapractice.corejava.typecasting_conversion;

public class TypeCastConvDemo {

	public static void main(String[] args) {

		int intNum = 100;

		// automatic type conversion

		long longNum = intNum; // int to float
		float floatNum = longNum; // long to float

		System.out.println("Int value " + intNum);
		System.out.println("Long value " + longNum);
		System.out.println("Float value " + floatNum);

		double doubleNum = 100.04;

		// explicit type casting

		long longNum1 = (long) doubleNum;
		int intNum1 = (int) longNum1;

		System.out.println("Double value " + doubleNum);

		// fractional part lost
		System.out.println("Long value " + longNum);

		// fractional part lost
		System.out.println("Int value " + intNum1);

	}
}