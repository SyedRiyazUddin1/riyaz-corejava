package com.nisum.shoppingCartProject;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.nisum.project1.utils.MyLoggers;

public final class MyCart extends ProductsList {

	public static void main(String[] args) {

		ArrayList<Product> productsList = MyCart.getProduct();

		MyLoggers.consoleLogger.info(
				"\n*************** Welcome to our Shopping Website *********************\n \nAvailable Items in the stock: ");

		// printing productsList

		productsList.forEach(product -> {
			MyLoggers.consoleLogger.info(product.toString());
		});

		// creating a new list to add selected items from users
		ArrayList<Product> cartList = new ArrayList<Product>();

		// taking inputs from user and adding the items in the new list

		Scanner scanner = new Scanner(System.in);
		MyLoggers.consoleLogger.info("\nDo you want to add an item in your cart? Type Yes/No:");
		String str = scanner.next();

		// code in the below WHILE LOOP executes till (String str !=yes)
		while (str.equalsIgnoreCase("Yes")) {

			MyLoggers.consoleLogger.info("\nAdd an item in your cart by entering the Product ID: ");

			int itemNo = scanner.nextInt();
			try {
				cartList.add(productsList.get(itemNo - 1));
				MyLoggers.consoleLogger.info(
						"Item Added. Type \'Yes\' if you want to add more products, else type any other key to go to order page and confirm:");
				str = scanner.next();
			} catch (IndexOutOfBoundsException e) {

				MyLoggers.consoleLogger.warn("\n**********Invalid product key!**********");
			}

		}
		MyLoggers.consoleLogger.info("\nItems added successfully in your cart.\n\nItems in your cart:\n");
		cartList.forEach(product -> {
			MyLoggers.consoleLogger.info(product.toString());
		});

		// taking the inputs from the user if they want to REMOVE any product from their
		// cart
		MyLoggers.consoleLogger.info(
				"\nIf you want to remove any product from your cart, type \'remove\' \nOR type \'confirm\' to place an order:");
		String str1 = scanner.next();

		// code in the below while loop executes till (String str1 !=yes)
		while (str1.equalsIgnoreCase("remove")) {
			MyLoggers.consoleLogger.info("\nPlease remove an item from your cart by entering the Product ID: ");
			int itemNumber = scanner.nextInt();
			try {
				cartList.remove(productsList.get(itemNumber - 1));
				MyLoggers.consoleLogger.info(
						"Item removed. Type \'remove\' if you want to remove more products, else type any other key to go to order page and confirm:");
				str1 = scanner.next();
			} catch (IndexOutOfBoundsException e) {
				System.out.println("**********Invalid product key! Please enter a valid key********");
				itemNumber = scanner.nextInt();
				cartList.remove(productsList.get(itemNumber - 1));
			}
		}

		MyLoggers.consoleLogger.info("Order placed successfully. Below are the details of your order:\n");

		cartList.forEach(product -> {
			MyLoggers.consoleLogger.info(product.toString());
		});

		// printing the total bill
		Double total = cartList.stream().collect(Collectors.summingDouble(Product::getPrice));
		System.out.println("\nTotal Bill : Rs." + total);

		MyLoggers.consoleLogger.info("\nPlease type \"print if you want to print the bill or any other key to exit");
		str1 = scanner.next();

//		try {
//			if (str1.equalsIgnoreCase("PRINT")) {
//				FileOutputStream fos = new FileOutputStream("D:\\Java Programs\\ShoppingBill.txt");
//				ObjectOutputStream oos = new ObjectOutputStream(fos);
//				cartList.forEach(product -> {
//					try {
//						oos.writeObject(product);
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				});

//				System.out.println("Total bill is saved in folder D:\\Java Programs\\ShoppingBill.txt");
//				oos.close();
//			}
//			}
//			
//			catch (IOException i) {
//		         i.printStackTrace();
//		      }		

		scanner.close();

		MyLoggers.consoleLogger.info("Thank you for Shopping with us. Please visit again");

	}
}
