package com.mindtree.javastreams;

import java.util.Arrays;
import java.util.List;

public class JavaStreams7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Stream from List,filter and print
		List<String> names = Arrays.asList("Bharath", "Kiran", "Sujeeth", "Sandhya", "Sreeja");
		names.stream().map(String::toLowerCase).filter(x -> x.startsWith("s")).forEach(x -> System.out.println(x));
	}

}
