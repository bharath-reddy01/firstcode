package com.mindtree.functionalinterface;

// Without Arguments

public class CalculatorImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//          CalculatorImpl c=new CalculatorImpl();
//          c.switchOn();

		Calculator c = () -> {
			System.out.println("Switch ON");
		};

		c.switchOn();
	}

//	@Override
//	public void switchOn() {
//		// TODO Auto-generated method stub
//		System.out.println("Switch ON");
//	}

}
