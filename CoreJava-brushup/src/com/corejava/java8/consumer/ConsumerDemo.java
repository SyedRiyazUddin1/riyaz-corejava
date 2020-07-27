package com.corejava.java8.consumer;

import java.util.function.Consumer;

import com.corejava.util.MyLogger;

public class ConsumerDemo {
	
	public static void main(String[] args) {
		
		Consumer<String> con = s->MyLogger.consoleLogger.info(s);
		
		con.accept("Syed Riyaz Uddin");
	}

}
