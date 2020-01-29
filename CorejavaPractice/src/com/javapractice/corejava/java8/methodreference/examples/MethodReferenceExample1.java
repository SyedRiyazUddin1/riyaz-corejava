package com.javapractice.corejava.java8.methodreference.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceExample1 {
	public static void main(String args[]) {

		// initialize order book with few orders
		List<Order> orderBook = new ArrayList<>();
		orderBook.add(new Order(1000, "GOOG.NS", 1220.17, Order.Side.BUY));
		orderBook.add(new Order(4000, "MSFT.NS", 37.47, Order.Side.SELL));

		// Sort all orders on price, using lambda expression
		System.out.println("Before sorting : " + orderBook);
		
	
		Collections.sort(orderBook, (a, b) -> a.getQuantity() - b.getQuantity());
		Collections.sort(orderBook, (a, b) -> Order.compareByQuantity(a, b));
		Collections.sort(orderBook, Order::compareByQuantity);
		
		System.out.println("After sorting by order quantity : " + orderBook);

		Collections.sort(orderBook, Order::compareByValue);
		System.out.println("After sorting by trade value : " + orderBook);

		Order order = orderBook.get(0); // you need a reference of object
		Collections.sort(orderBook, order::compareByPrice);
		System.out.println("Order book after sorting by price : " + orderBook);

		String[] symbols = { "GOOG.NS", "APPL.NS", "MSFT.NS", "AMZN.NS" };
		Arrays.sort(symbols, String::compareToIgnoreCase);

	}
}

class Order {
	public enum Side {
		BUY, SELL
	};

	private final int quantity;
	private final String symbol;
	private final double price;
	private final Side side;

	public Order(int quantity, String symbol, double price, Side side) {
		this.quantity = quantity;
		this.symbol = symbol;
		this.side = side;
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getSymbol() {
		return symbol;
	}

	public double getPrice() {
		return price;
	}

	public Side getSide() {
		return side;
	}

	@Override
	public String toString() {
		return String.format("%s %d %s at price %.02f", side, quantity, symbol, price);
	}

	public static int compareByQuantity(Order a, Order b) {
		return a.quantity - b.quantity;
	}

	public int compareByPrice(Order a, Order b) {
		return Double.valueOf(a.getPrice()).compareTo(Double.valueOf(b.getPrice()));
	}

	public static int compareByValue(Order a, Order b) {
		Double tradeValueOfA = a.getPrice() * a.getQuantity();
		Double tradeValueOfB = b.getPrice() * b.getQuantity();
		return tradeValueOfA.compareTo(tradeValueOfB);

	}
}
