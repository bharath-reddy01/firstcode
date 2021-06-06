package com.mindtree.javaeight;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Bharath");
		list.add("Sujeeth");
		list.add("Arjun");
		list.add("Kiarn");
		list.add("Harish");
		list.forEach(
				// lambda expression
				(names) -> System.out.println(names));
	}

}
