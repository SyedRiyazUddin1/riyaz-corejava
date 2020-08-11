package com.corejava.logicprograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.corejava.util.MyLogger;

class Product3 {
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

	Product3(String name, double price) {
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

		List<Product3> productList = new ArrayList<Product3>();
		productList.add(new Product3("Redmi Mobile", 30000));
		productList.add(new Product3("Vivo Mobile", 30000));
		productList.add(new Product3("iPhone", 60000));
		productList.add(new Product3("Samsung Note10", 70001));
		productList.add(new Product3("OnePlus 6T", 38000));

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
		Optional<Product3> productOptional = productList.stream().filter(product -> product.getPrice() >= 30000)
				.findAny();
		Product3 product = productOptional.orElseThrow(() -> new RuntimeException("No data exist"));
		MyLogger.consoleLogger.info("Elements which are > 30000:" + product);

		/**
		 * findFirst : find the first element from the stream
		 */
		Optional<Product3> productOptional1 = productList.stream().filter(product1 -> product1.getPrice() > 30000)
				.findFirst();
		Product3 product1 = productOptional1.orElseThrow(() -> new RuntimeException("No data exist"));
		MyLogger.consoleLogger.info("First element > 30000:" + product1);

		/** */

		/**
		 * Reducing operations. Summing all the elements
		 */
		double sum = productList.stream().map(Product3::getPrice).reduce(0.0, (p1, p2) -> (p1 + p2));
		MyLogger.consoleLogger.info("Sum of all the prices: " + sum);

		/**
		 * Reducing operations. Multiplying all the elements
		 */
		double multiply = productList.stream().map(Product3::getPrice).reduce(1.0, (p1, p2) -> (p1 * p2));
		MyLogger.consoleLogger.info("Multiplying all the prices: " + multiply);

		/**
		 * Reducers without initial value. Multiplying all the elements
		 */
		Optional<Double> sum1 = productList.stream().map(Product3::getPrice).reduce((p1, p2) -> (p1 + p2));
		MyLogger.consoleLogger.info("Sum of all the prices with reducers(without initial value): " + sum1.orElse(0.0));

		/**
		 * Reducers using Double class Object
		 */
		Optional<Double> sumUsingDoubleClass = productList.stream().map(Product3::getPrice).reduce(Double::sum);
		MyLogger.consoleLogger
				.info("Sum of all the prices using Double class Object: " + sumUsingDoubleClass.orElse(0.0));

		/**
		 * Getting the minimum value using Double class's min method
		 */
		Optional<Double> minValue = productList.stream().map(Product3::getPrice).reduce(Double::min);
		MyLogger.consoleLogger
				.info("Getting the minimum value using Double class's min method: " + minValue.orElse(0.0));

		/**
		 * Getting the max value using Double class's max method
		 */
		Optional<Double> maxValue = productList.stream().map(Product3::getPrice).reduce(Double::max);
		MyLogger.consoleLogger
				.info("Getting the maximum value using Double class's max method: " + maxValue.orElse(0.0));

		/**
		 * USING COLLECTORS
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
				.collect(Collectors.summingDouble(Product3::getPrice));
		MyLogger.consoleLogger.info(sum2);

		/**
		 * Averaging all the even numbers from the product's prices
		 */
		double avg = productList.stream().filter(product2 -> product2.getPrice() % 2 == 0)
				.collect(Collectors.averagingDouble(Product3::getPrice));
		MyLogger.consoleLogger.info(avg);

		/**
		 * Getting the MAX price from the product's prices
		 */
		Comparator<Product3> numComp = Comparator.comparingDouble(p -> p.getPrice());
		Optional<Product3> maxPrice = productList.stream().collect(Collectors.maxBy(numComp));
		MyLogger.consoleLogger.info("MAX price from the product's list: " + maxPrice);
		/**
		 * Getting the MIN price from the product's prices
		 */
		Optional<Product3> minPrice = productList.stream().collect(Collectors.minBy(numComp));
		MyLogger.consoleLogger.info("MIN price from the product's list: " + minPrice.orElse(product1));

		/**
		 * Summarizing
		 */
		DoubleSummaryStatistics statistics = productList.stream()
				.collect(Collectors.summarizingDouble(p -> p.getPrice()));

		MyLogger.consoleLogger.info("MIN Statistics: " + statistics.getMin());
		MyLogger.consoleLogger.info("MAX Statistics: " + statistics.getMax());

		// printing the list in descending order based on the price
		List<Product3> newList = productList.stream().sorted(
				(num1, num2) -> (num1.getPrice() < num2.getPrice()) ? 1 : (num1.getPrice() > num2.getPrice()) ? -1 : 0)
				.collect(Collectors.toList());
		MyLogger.consoleLogger.info("List in descending order based on the price " + newList);

		// Get the second highest (already sorted above)
		MyLogger.consoleLogger.info("Product with second highest price " + newList.get(1));

		// Get the product with second lowest price
		MyLogger.consoleLogger.info("Product with second lowest price " + newList.get(newList.size() - 2));

		// String Joining without Separator
		String joiningOutput1 = productList.stream().map(p -> p.getName()).collect(Collectors.joining());
		MyLogger.consoleLogger.info("Joining all the product names from the list without separator " + joiningOutput1);

		// String Joining with Separator
		String joiningOutput2 = productList.stream().map(p -> p.getName()).collect(Collectors.joining(", "));
		MyLogger.consoleLogger.info("Joining all the product names from the list with separator " + joiningOutput2);

		// GROUP BY
		// Count of similar prices:
		Map<Object, Long> typeMapCount = productList.stream()
				.collect(Collectors.groupingBy(p -> p.getPrice(), Collectors.counting()));
		MyLogger.consoleLogger.info("Count of similar objects: " + typeMapCount);

		// Summing objects of similar prices:
		Map<Object, Double> typeMapSumming = productList.stream()
				.collect(Collectors.groupingBy(p -> p.getPrice(), Collectors.summingDouble(p -> p.getPrice())));
		MyLogger.consoleLogger.info("Summing objects of similar prices: " + typeMapSumming);

		// Collectors.partioningBy()
		Map<Boolean, List<Product3>> result = productList.stream()
				.collect(Collectors.partitioningBy(p -> p.getPrice() > 40000));
		MyLogger.consoleLogger.info("Products with price>40K will come under true, Else, in false: " + result);
		
		// products starts with R letter
				List<Product3> pnamesList = productList.stream().filter(p -> p.getName().startsWith("R"))
						.collect(Collectors.toList());
				MyLogger.consoleLogger.info("Product name starts with R :" + pnamesList);

				// products which are on even index number (HAVE TO WORK)
				List<Product3> evenNumIndexProducts = productList.stream().filter(p -> p.getName().length() % 2 == 0)
						.collect(Collectors.toList());
				MyLogger.consoleLogger.info("Product name starts with R :" + evenNumIndexProducts);

//				String str[] = {"Avinash Edamadakala Riyaz Uddin"};
//				List<String> stream = Arrays.asList(str).stream().filter(p->p.indexOf(i%2==0)).collect(Collectors.toList());
//				
				List<Product3> pList = productList.stream().filter(p -> p.getPrice() >= 38000).collect(Collectors.toList());
				MyLogger.consoleLogger.info(pList);

	}

}
