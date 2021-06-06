package com.mindtree.javaeight;

@FunctionalInterface
interface Addable {
	public int add(int a, int b);
}

public class LambdaExpression3 {
	public static void main(String[] args) {

		// Multiple parameters in lambda expression
		Addable ad = (a, b) -> (a + b);
		System.out.println(ad.add(10, 20));

		// Multiple parameters with data type in lambda expression
		Addable ad1 = (int a, int b) -> (a + b);
		System.out.println(ad1.add(10, 20));
	}
}
