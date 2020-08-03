package com.corejava.java8.date_time;

import java.time.LocalDate;

import com.corejava.util.MyLogger;

public class DateInCustomizedFormatDemo {

	public static void main(String[] args) {
		
		//printing the current date
		LocalDate date = LocalDate.now();
		MyLogger.consoleLogger.info(date);

		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();

		MyLogger.consoleLogger.info("Printing date in our own format: " + month + "-" + day + "-" + year);

	}

}
