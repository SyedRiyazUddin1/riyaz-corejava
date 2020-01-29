package com.javapractice.corejava.collectionsframework;
import org.apache.log4j.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MyCart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Object> items = new ArrayList<Object>();

		System.out.println("*************** Welcome to our Shopping Website *********************");
		System.out.println("*********************************************************************");

		System.out.println("Please enter Product1 name: ");
		String input_Item1 = sc.next();
		items.add("Product1:     " + input_Item1);

		System.out.println("Please enter Product1 price: ");
		double input_Item2 = sc.nextDouble();
		items.add("Price:               " + input_Item2);

		System.out.println("Please enter Product2 name: ");

		String input_Item3 = sc.next();
		items.add("Product2:     " + input_Item3);

		System.out.println("Please enter Product2 price:");

		double input_Item4 = sc.nextDouble();
		items.add("Price:               " + input_Item4);

		sc.close();

		System.out.println(" ");
		System.out.println("Your order has been successfully placed. Below are the order details:");
		System.out.println("*********************************************************************");

		for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i));
		}
		System.out.println("*********************************************************************");
		// total price
		double sum = input_Item2 + input_Item4;

		System.out.println("Total price:         " + sum);

		System.out.println("*********************************************************************");
		System.out.println("Thank you for shopping with us :) ");
	}
}
