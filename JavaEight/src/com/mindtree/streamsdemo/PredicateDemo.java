package com.mindtree.streamsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> predicate = t -> t % 2 == 0;
		System.out.println(predicate.test(12));

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.stream().filter(predicate).forEach(t -> System.out.println("Printing Even : " + t));
	}

}
