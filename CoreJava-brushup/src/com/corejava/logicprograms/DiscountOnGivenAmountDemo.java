package com.corejava.logicprograms;

import java.util.Scanner;

import com.corejava.util.MyLogger;

//For the given amount, print the final amount after 25% of discount

public class DiscountOnGivenAmountDemo {

	public static void main(String args[]) {

		double discount, finalPrice, markedPrice, num;
		
		MyLogger.consoleLogger.info("Please enter the price to avail 25% discount :");
		
		Scanner sc = new Scanner(System.in);

		markedPrice = sc.nextInt();

		discount = 25;

		System.out.println("markedPrice= " + markedPrice);


		num = 100 - discount;

		finalPrice = (num * markedPrice) / 100;

		System.out.println("Price after 25% discount=" + finalPrice);

		sc.close();

	}
}