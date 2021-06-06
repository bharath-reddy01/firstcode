package com.mindtree.streamsdemo;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<Integer> consumer = (t) -> {
			System.out.println("Print " + t);
		};
		consumer.accept(2);
	}
}
