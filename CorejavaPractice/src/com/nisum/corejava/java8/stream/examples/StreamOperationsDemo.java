//program to perform different operations on Stream.

package com.nisum.corejava.java8.stream.examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

//Product class
class Product { 
	int ProducId;
	String ProductName;
	float ProductPrice;

	//creating constructor of Product class with parameters
	public Product(int ProducId, String ProductName, float ProductPrice) {
		this.ProducId = ProducId;
		this.ProductName = ProductName;
		this.ProductPrice = ProductPrice;
	}
}

//Main class
public class StreamOperationsDemo {
	public static void main(String[] args) {

		//creating an ArrayList and adding all the below objects
		
		List<Product> productsList = new ArrayList<Product>();

		productsList.add(new Product(1, "Iphone Mobile", 75000));
		productsList.add(new Product(2, "Samsung Mobile", 40000));
		productsList.add(new Product(3, "OnePlus Mobile", 30000));
		productsList.add(new Product(4, "Vivo Mobile", 28000));
		productsList.add(new Product(5, "Oppo Mobile", 25000));
		
		
		
		System.out.println("Product List with Price and Id Details");
		
		
		productsList.forEach(product -> System.out.println(product));
		
			// Lets create a stream of Product Prices by fetching all the prices and convert
		// it back into List

		List<Float> productPriceList = productsList.stream()
				.map(function -> function.ProductPrice) // fetching price
				.collect(Collectors.toList()); // collecting as list
		
		System.out.println("Prices of All the Mobile Phones:\n" +productPriceList);

		// Lets create a stream of Product names by fetching product names starting with
		// "O"and convert it back into List

		List<String> NamesStartWithOList = productsList.stream()
				.map(function -> function.ProductName)
				.filter(function -> function.startsWith("X"))
				.collect(Collectors.toList());
		System.out.println("Product names starting with \"O letter:\n" +NamesStartWithOList);
		
		
	}
}
