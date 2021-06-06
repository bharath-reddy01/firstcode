package com.mindtree.javastreams;

import java.util.stream.Stream;

public class JavaStreams5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Stream from Array, sort and filter
		String[] names = { "Bharath", "Sujeeth", "Rahul", "Sonia", "Bindu", "Sreeja" };
		Stream.of(names).filter(x -> x.startsWith("S")).sorted().forEach(x -> System.out.println(x));
	}

}
