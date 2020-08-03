package com.corejava.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.corejava.util.MyLogger;

class Product1 {
	String name;
	double price;

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

public class FindMatchUsingStreamsDemo {

	public static void main(String[] args) {

		List<Product1> productList = new ArrayList<Product1>();
		productList.add(new Product1("Redmi Mobile", 30000));
		productList.add(new Product1("iPhone", 60000));
		productList.add(new Product1("Samsung Note10", 70001));
		productList.add(new Product1("OnePlus 6T", 38000));

		MyLogger.consoleLogger.info(productList);

		/** anyMatch (checking to see if predicate matches atleast one) */

		boolean anyMatchStatus = productList.stream().anyMatch(list -> list.getPrice() == 60000);
		MyLogger.consoleLogger.info("Any product with price 60000 :" + anyMatchStatus);

		/** allMatch (checking to see if predicate matches with all the elements) */

		boolean allMatchStatus = productList.stream().allMatch(list -> list.getPrice() >= 30000);
		MyLogger.consoleLogger.info("If all the Product's price >=30000 :" + allMatchStatus);

		/**
		 * noneMatch, opposite of allMatch (checking to see if predicate matches with
		 * all the elements)
		 */
		boolean noneMatchStatus = productList.stream().noneMatch(list -> list.getPrice() >= 30000);
		MyLogger.consoleLogger.info("If all the Product's price is >=30000 :" + noneMatchStatus);

		/**
		 * findAny : returns any of the matching element of the current stream
		 */
		Optional<Product1> productOptional = productList.stream().filter(product -> product.getPrice() >= 30000)
				.findAny();
		Product1 product = productOptional.orElseThrow(() -> new RuntimeException("No data exist"));
		MyLogger.consoleLogger.info("Elements which are > 30000:" + product);

		/**
		 * findFirst : find the first element from the stream
		 */
		Optional<Product1> productOptional1 = productList.stream().filter(product1 -> product1.getPrice() > 30000)
				.findFirst();
		Product1 product1 = productOptional1.orElseThrow(() -> new RuntimeException("No data exist"));
		MyLogger.consoleLogger.info("First element > 30000:" + product1);

		/** */

		/**
		 * Reducing operations. Summing all the elements
		 */
		double sum = productList.stream().map(Product1::getPrice).reduce(0.0, (p1, p2) -> (p1 + p2));
		MyLogger.consoleLogger.info("Sum of all the prices: " + sum);

		/**
		 * Reducing operations. Multiplying all the elements
		 */
		double multiply = productList.stream().map(Product1::getPrice).reduce(1.0, (p1, p2) -> (p1 * p2));
		MyLogger.consoleLogger.info("Multiplying all the prices: " + multiply);

		/**
		 * Reducers without initial value. Multiplying all the elements
		 */
		Optional<Double> sum1 = productList.stream().map(Product1::getPrice).reduce((p1, p2) -> (p1 + p2));
		MyLogger.consoleLogger.info("Sum of all the prices with reducers(without initial value): " + sum1.orElse(0.0));

		/**
		 * Reducers using Double class Object
		 */
		Optional<Double> sumUsingDoubleClass = productList.stream().map(Product1::getPrice).reduce(Double::sum);
		MyLogger.consoleLogger
				.info("Sum of all the prices using Double class Object: " + sumUsingDoubleClass.orElse(0.0));

		/**
		 * Getting the minimum value using Double class's min method
		 */
		Optional<Double> minValue = productList.stream().map(Product1::getPrice).reduce(Double::min);
		MyLogger.consoleLogger
				.info("Getting the minimum value using Double class's min method: " + minValue.orElse(0.0));

		/**
		 * Getting the max value using Double class's max method
		 */
		Optional<Double> maxValue = productList.stream().map(Product1::getPrice).reduce(Double::max);
		MyLogger.consoleLogger
				.info("Getting the maximum value using Double class's max method: " + maxValue.orElse(0.0));

		/** USING COLLECTORS
		 * 
		 * Getting the count of even numbers from the product's prices
		 */
		double count = productList.stream().filter(product2 -> product2.getPrice() % 2 == 0)
				.collect(Collectors.counting());
		MyLogger.consoleLogger.info(count);

		/**
		 * Summing all the even numbers from the product's prices
		 */
		double sum2 = productList.stream().filter(product2 -> product2.getPrice() % 2 == 0)
				.collect(Collectors.summingDouble(Product1::getPrice));
		MyLogger.consoleLogger.info(sum2);
		
		/**
		 * Averaging all the even numbers from the product's prices
		 */
		double avg = productList.stream().filter(product2 -> product2.getPrice() % 2 == 0)
				.collect(Collectors.averagingDouble(Product1::getPrice));
		MyLogger.consoleLogger.info(avg);
		
		/**
		 * Getting the MAX price from the product's prices
		 */
		double maxPrice = productList.stream().filter(product2 -> product2.getPrice() % 2 == 0)
				.collect(Collectors.averagingDouble(Product1::getPrice));
		MyLogger.consoleLogger.info("MAX price from the product's list: "+maxPrice);
		

	}

}
