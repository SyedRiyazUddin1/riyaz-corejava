package com.javapractice.corejava.java8.demo;

import java.util.Comparator;
import java.util.function.Function;

@FunctionalInterface
public interface MyComparator<T> extends Comparator<T> {

	public int compare(T a, T b);

	public static <U> Comparator<U> comparing(Function<U, Comparable> f) {
		return (e1, e2) -> f.apply(e1).compareTo(f.apply(e2));
	}

	public default Comparator<T> theComparing(MyComparator<T> cmp) {
		return (e1, e2) -> compare(e1, e2) == 0 ? cmp.compare(e1, e2) : compare(e1, e2);
	}

}
