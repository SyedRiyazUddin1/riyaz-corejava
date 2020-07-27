package com.corejava.java8.consumer;

import java.util.function.Consumer;

import com.corejava.util.MyLogger;

class Movie {
	String name;

	Movie(String name) {
		this.name = name;
	}
}

public class ConsumerDemo2 {

	public static void main(String[] args) {

		Consumer<Movie> c1 = movie -> MyLogger.consoleLogger.info(movie.name + "ready to release");
		Consumer<Movie> c2 = movie -> MyLogger.consoleLogger.info(movie.name + "released but flopped!");
		Consumer<Movie> c3 = movie -> MyLogger.consoleLogger.info(movie.name + "storing into database");
		Consumer<Movie> c4 = c1.andThen(c2).andThen(c3);

		Movie movie = new Movie("Race3");

		c1.accept(movie);
		c2.accept(movie);
		c2.accept(movie);
		c4.accept(movie); //all three consumers are going to execute
	}

}
