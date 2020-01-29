package com.javapractice.corejava.java8.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionsStream {

	public static void main(String... strings) {
		List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		ints.stream().reduce(new ArrayList<Integer>(), (list, i) -> {
			list.add(i);
			return list;
		}, (list1, list2) -> {
			list1.addAll(list2);
			return list1;
		});

		Stream<Integer> stream = ints.stream();
		stream.forEach(System.out::println);

		Stream<Integer> stream1 = Stream.of(0, 1, 2, 3, 4);
		stream1.skip(3).findFirst();

		Stream<String> stringStream = Stream.generate(() -> "simpleString");
		stringStream.limit(5).forEach(System.out::println);

		Stream<String> itrStream = Stream.iterate("", s -> s + "+");
		itrStream.limit(5).forEach(System.out::println);

		IntStream randomints = ThreadLocalRandom.current().ints();
		randomints.limit(10).forEach(System.out::println);

	}

}
