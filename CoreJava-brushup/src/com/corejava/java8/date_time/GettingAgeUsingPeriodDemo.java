package com.corejava.java8.date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

import com.corejava.util.MyLogger;

public class GettingAgeUsingPeriodDemo {

	public static void main(String[] args) {

		LocalDate birthday = LocalDate.of(1994, 01, 31);
		LocalDate today = LocalDate.now();

		Period age = Period.between(birthday, today);

		// the period of time from by birth till now
		MyLogger.consoleLogger.info(
				"Your age is: " + age.getYears() + " years " + age.getMonths() + " months " + age.getDays() + " days");

//	      Duration class is used to check the duration of time between two times

		LocalTime time1 = LocalTime.now();
		Duration fiveHours = Duration.ofHours(5);

		// adding 5 hours in the current time
		LocalTime time2 = time1.plus(fiveHours);

		// checking the duration between two times
		Duration timeGap = Duration.between(time1, time2);
		MyLogger.consoleLogger.info("Time Gap " + timeGap);

	}
}
