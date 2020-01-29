//Simple program using lamda expression
package com.javapractice.corejava.java8.lambdaexpressions.examples;

//creating Functional interface which will have only 1 abstract method
interface Drawable {
	public void draw();
}

public class LambdaExpressionDemo2 {

	public static void main(String[] args) {
		Drawable dr = () -> {
			System.out.println("Drawing");
		};
		dr.draw();

	}

}
