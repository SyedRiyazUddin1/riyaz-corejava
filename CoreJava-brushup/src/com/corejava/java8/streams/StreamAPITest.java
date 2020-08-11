package com.corejava.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.corejava.util.MyLogger;

class Product3 {
	String name;
	int pId;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	double price;

	public String getName() {
		return name;
	}

	public Product3(String name, int pId, double price) {
		super();
		this.name = name;
		this.pId = pId;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product3 [name=" + name + ", pId=" + pId + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pId;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product3 other = (Product3) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pId != other.pId)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
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

	Product3(String name, double price) {
		this.name = name;
		this.price = price;
	}

}

public class StreamAPITest {

	public static void main(String[] args) {

		List<Product3> productList = new ArrayList<Product3>();
		productList.add(new Product3("Redmi Mobile",106, 30000));
		productList.add(new Product3("Redmi Mobile",102, 38000));
		productList.add(new Product3("Vivo Mobile", 104,30000));
		productList.add(new Product3("iPhone", 103,60000));
		productList.add(new Product3("Samsung Note10",105, 70001));
		productList.add(new Product3("OnePlus 6T", 101,37000));

		// Adding 13% tax to the product price

		List<Product3> listWithTax = productList.stream().map(product -> {
			double tax = product.getPrice() * 13 / 100;
			product.setPrice(product.getPrice() + tax);
			return product;
		}).collect(Collectors.toList());

		MyLogger.consoleLogger.info("New list with 13% tax price: " + listWithTax);

		// iterating the list
		MyLogger.consoleLogger.info("iterating the list");
		listWithTax.forEach(p -> MyLogger.consoleLogger.info(p));

		// converting list to set, overrided hashcode and equals methods in the product
		// class
		Set<Product3> setOfProducts = listWithTax.stream().collect(Collectors.toSet());
		setOfProducts.forEach(p -> MyLogger.consoleLogger.info(p));

		// converting set to Map
		Map<Object, Object> mapOfProducts = setOfProducts.stream()
				.collect(Collectors.toMap(p -> p.getpId(), p -> p.getName()));
		MyLogger.consoleLogger.info("Converting set to Map :"+ mapOfProducts);
		
		//iterating a map
		mapOfProducts.forEach((key,value)->MyLogger.consoleLogger.info("Emp id: "+key + " Emp Name: "+value));
		

	}

}
