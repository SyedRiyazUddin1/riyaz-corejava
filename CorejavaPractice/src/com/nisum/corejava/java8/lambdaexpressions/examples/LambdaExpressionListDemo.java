package com.nisum.corejava.java8.lambdaexpressions.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionListDemo {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

//		Using Consumer Interface
		Consumer<Integer> c = new Consumer<Integer>() {

		public void accept(Integer i) {
				System.out.println(i);
			}
		};
//		values.forEach(c);

//		code concise using Lambda expression
		values.forEach((i) -> System.out.println(i));

	}
}
