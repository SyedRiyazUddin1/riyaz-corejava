//Consumer interface program
package com.javapractice.corejava.java8.functional_interfaces.examples;

//importing Consumer interface
import com.javapractice.corejava.util.MyLogger;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo {
	
	public static void main(String[] args) {

		Consumer<Integer> consumer = (number) -> MyLogger.consoleLogger.info("Printing..."+ number);
		//passing the input in the accept() method of Consumer interface
		consumer.accept(10);	
	}
	
}
