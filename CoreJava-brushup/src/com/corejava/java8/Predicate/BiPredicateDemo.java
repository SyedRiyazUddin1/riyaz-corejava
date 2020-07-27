package com.corejava.java8.Predicate;

import java.util.function.BiPredicate;

//passing 2arguments in BiPredicate

import com.corejava.util.MyLogger;

public class BiPredicateDemo {
	
	public static void main(String[] args) {
	
		BiPredicate<Integer,Integer> biPredicate = (a,b)->(a+b)%2==0;
		MyLogger.consoleLogger.info(biPredicate.test(10, 20));
		MyLogger.consoleLogger.info(biPredicate.test(10, 31));
		
	}
	

}
