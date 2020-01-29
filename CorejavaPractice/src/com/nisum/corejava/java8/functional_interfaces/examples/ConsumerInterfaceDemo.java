//Consumer interface program
package com.nisum.corejava.java8.functional_interfaces.examples;

//importing Consumer interface
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {
	
	public static void main(String[] args) {

		Consumer<Integer> consumer = (t) -> System.out.println("Printing..."+ t);
		//passing the input in the accept() method of Consumer interface
		consumer.accept(10);	
	}
	
}
