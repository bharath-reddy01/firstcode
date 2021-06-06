package com.mindtree.defaultandstatic;

public interface A {

	void m1();
	
	default void m2() {
		System.out.println("m2 from interface A");
	}

	static void m3() {
		System.out.println("m3 from interface A");
	}

}
