package com.mindtree.streamsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductInfo {
	public static void main(String[] args) {
		Product p1 = new Product(1, "Apple", 100, 2);
		Product p2 = new Product(2, "Banana", 200, 4);
		Product p3 = new Product(3, "Mango", 500, 6);
		Product p4 = new Product(4, "Grapes", 300, 3);
		Product p5 = new Product(5, "Orange", 250, 1);

		List<Product> products = new ArrayList<>(Arrays.asList(new Product[] { p1, p2, p3, p4, p5 }));
		System.out.println(products);
		
		// filter products under price 300
		// get all quantities
		// reduce the quantities - sum
		
		Integer sum=products.stream().filter((info)-> {
			return info.getPrice()<400;
		})
		.map(Product::getQuantity)
		.reduce(0, (a,b)->{
			return a+b;
		});
		System.out.println(sum);
	}

}
