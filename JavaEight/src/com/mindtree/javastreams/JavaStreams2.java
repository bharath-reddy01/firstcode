package com.mindtree.javastreams;

import java.util.stream.IntStream;

public class JavaStreams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Integer Stream with Skip
		IntStream.range(1, 10).skip(4).forEach(x -> System.out.println(x));
		System.out.println();
	}

}
