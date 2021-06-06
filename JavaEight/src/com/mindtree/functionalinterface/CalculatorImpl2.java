package com.mindtree.functionalinterface;

// With Arguments

public class CalculatorImpl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator2 c2 = (input) -> {
			System.out.println("Sum " + input);
		};
		c2.sum(10);
	}
}
