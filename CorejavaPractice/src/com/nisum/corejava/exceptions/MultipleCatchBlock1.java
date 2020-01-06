package com.nisum.corejava.exceptions;

public class MultipleCatchBlock1 {

	public static void main(String[] args) {

		try {
			int myArray[] = new int[5];
			myArray[5] = 30 / 0;
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code...");
	}
}
