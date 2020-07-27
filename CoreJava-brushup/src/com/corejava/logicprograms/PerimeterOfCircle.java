package com.corejava.logicprograms;

import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String args[]) {

		int radius = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter radius of a circle: ");

		radius = in.nextInt();

		/*
		 * where r is a radius of a circle then perimeter of a circle is Area= 2 * pi * r
		 *
		 */

		double perimeter = 2 * Math.PI * radius;

		System.out.println("Perimeter of the circle =" + perimeter);

	}
}
