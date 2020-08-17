package com.corejava.logicprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.corejava.util.MyLogger;

class Product1 {
	String name;
	double price;
	double finalPrice;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	Product1(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products List [name=" + name + ", price=" + price + "]";
	}
}

public class AddingTaxtoPriceUsingStream {

	public static void main(String[] args) {

		List<Product1> productList = new ArrayList<Product1>();
		productList.add(new Product1("Redmi Mobile", 30000));
		productList.add(new Product1("iPhone", 60000));
		productList.add(new Product1("Samsung Note10", 40000));
		productList.add(new Product1("OnePlus 6T", 38000));

		MyLogger.consoleLogger.info(productList);

		// adding 500 to all the price.
		List<Product1> newList = productList.stream().map(product -> {
			product.setPrice(product.getPrice() + 500);
			return product;
		}).collect(Collectors.toList());

		MyLogger.consoleLogger.info("Added 500 to the prices :" + newList);

		// adding 12% tax to the price.
		List<Product1> newList1 = productList.stream().map(product -> {
			double tax = product.getPrice() * 12 / 100;
			product.setPrice(product.getPrice() + tax);
			return product;
		}).collect(Collectors.toList());

		MyLogger.consoleLogger.info("Adding 12% tax to the prices :" + newList1);
		

		// changing each product name to UPPERCASE.
		List<Product1> newList2 = productList.stream().map(product -> {
			product.setName(product.getName().toUpperCase());
			return product;
		}).collect(Collectors.toList());

		MyLogger.consoleLogger.info("UpperCased each product name :" + newList2);

	}

}
