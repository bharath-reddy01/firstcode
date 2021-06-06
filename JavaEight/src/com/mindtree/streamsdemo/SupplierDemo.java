package com.mindtree.streamsdemo;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> supplier = () -> {
			return "This is Bharath";
		};
		System.out.println(supplier.get());
	}

}
