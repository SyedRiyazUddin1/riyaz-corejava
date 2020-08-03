package com.corejava.java8.date_time;

import java.time.LocalDate;
import java.time.LocalTime;

import com.corejava.util.MyLogger;

public class CurrentDateTimeDemo {

	public static void main(String[] args) {
		
		//printing the current date
		LocalDate date = LocalDate.now();
		MyLogger.consoleLogger.info(date);

		//printing the current time
		LocalTime time = LocalTime.now();
		MyLogger.consoleLogger.info(time);
	}

}
