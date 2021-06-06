package com.mindtree.javastreams;

import java.util.stream.Stream;

public class JavaStreams4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Stream.of, sorted and findFirst
		Stream.of("Bharath", "Ajith", "Rahul").sorted().findFirst().ifPresent(x -> System.out.println(x));
	}

}
