//program to reverse a string
package com.corejava.strings;

public class ReverseStringForLoopDemo {

	public static void main(String[] args) {

		String name = "Riyaz";
		String reverse = "";

		for (int loop = name.length() - 1; loop >= 0; loop--) {

			reverse = reverse + name.charAt(loop);
		}

		System.out.println(reverse);
		
		System.out.println(name.replace("z", "s")); //replacing char

	}

}
