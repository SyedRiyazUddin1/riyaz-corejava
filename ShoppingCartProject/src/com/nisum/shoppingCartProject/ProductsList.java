package com.nisum.shoppingCartProject;

import java.util.ArrayList;

public class ProductsList {
	
		
	public static ArrayList<Product> getProduct() {

		// creating ArrayList and adding all the items in it.
		ArrayList<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1, "OnePlus 7t,", 37999));
		productsList.add(new Product(2, "Samsung Note9,", 42799));
		productsList.add(new Product(3, "iPhone 11,", 75640));
		productsList.add(new Product(4, "Redmi Note7,", 34999));
		productsList.add(new Product(5, "Vivo V17,", 28000));

		return productsList;
	} 
}
	
