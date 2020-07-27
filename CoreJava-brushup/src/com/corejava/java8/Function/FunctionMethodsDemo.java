 package com.corejava.java8.Function;

 //Function Interface methods [andThen(), compose() methods]
 
import java.util.function.Function;

import com.corejava.util.MyLogger;

public class FunctionMethodsDemo {
	
	public static void main(String[] args) {
		
		Function<Integer,Integer> f1 = i->2*i;
		
		Function<Integer,Integer> f2= i->i*i*i;
		
		MyLogger.consoleLogger.info(f1.andThen(f2).apply(2)); //output: 64, f2 will execute after f1
		MyLogger.consoleLogger.info(f1.compose(f2).apply(2)); //output: 16, f will execute after f2
	}

}
