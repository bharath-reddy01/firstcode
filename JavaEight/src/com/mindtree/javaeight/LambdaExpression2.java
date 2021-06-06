package com.mindtree.javaeight;

@FunctionalInterface
interface Sayable {
	public String say(String name);
}

public class LambdaExpression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s = (name) -> {
			return "Hello " + name;
		};
		System.out.println(s.say("Bharath"));
	}

}
