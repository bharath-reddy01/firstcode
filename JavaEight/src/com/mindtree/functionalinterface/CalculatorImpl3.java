package com.mindtree.functionalinterface;

// Multiple Arguments with return type

public class CalculatorImpl3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator3 c3 = (a, b) -> {
			return b * a;
		};
		System.out.println(c3.multiply(5, 4));
	}

}
