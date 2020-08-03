package com.corejava.java8.date_time;

import java.time.LocalDateTime;

import com.corejava.util.MyLogger;

public class LocalDatetimeClassDemo {

	public static void main(String[] args) {

		LocalDateTime datetime = LocalDateTime.now();

		int day = datetime.getDayOfMonth();
		int month = datetime.getMonthValue();
		int year = datetime.getYear();
		MyLogger.consoleLogger.info("Date: " + month + "-" + day + "-" + year);

		int hours = datetime.getHour();
		int min = datetime.getMinute();
		int sec = datetime.getSecond();
		int nsec = datetime.getNano();
		MyLogger.consoleLogger.info("Time: " + hours + ":" + min + ":" + sec + ":" + nsec);
	}

}
