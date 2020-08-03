package com.corejava.java8.date_time;

import java.time.LocalDateTime;

import com.corejava.util.MyLogger;

public class PeriodBetweenDates {

	public static void main(String[] args) {

		LocalDateTime dateTime = LocalDateTime.now();
		MyLogger.consoleLogger.info(dateTime);

		MyLogger.consoleLogger.info("After 10 months: " + dateTime.plusMonths(10));
		MyLogger.consoleLogger.info("before 10 months: " + dateTime.minusMonths(10));
	}

}
