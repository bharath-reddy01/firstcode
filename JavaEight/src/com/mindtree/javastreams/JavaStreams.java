package com.mindtree.javastreams;

import java.util.stream.IntStream;

public class JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Integer Stream
		IntStream.range(1, 10).forEach(x->System.out.println(x));
		System.out.println();
	}

}
