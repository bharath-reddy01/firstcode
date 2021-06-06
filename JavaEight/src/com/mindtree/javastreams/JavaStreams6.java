package com.mindtree.javastreams;

import java.util.Arrays;

public class JavaStreams6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Average of numbers
		Arrays.stream(new int[] { 1, 2, 3, 4, 5 }).map(x -> x * x).average().ifPresent(x -> System.out.println(x));
	}

}
