package com.mindtree.javaeight;

@FunctionalInterface
interface Drawable {
	public void draw();
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Drawable drawable = () -> {
			System.out.println("Drawing " + a);
		};
		drawable.draw();
	}

}
 