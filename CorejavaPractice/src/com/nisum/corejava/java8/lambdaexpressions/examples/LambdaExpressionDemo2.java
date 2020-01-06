package com.nisum.corejava.java8.lambdaexpressions.examples;

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
