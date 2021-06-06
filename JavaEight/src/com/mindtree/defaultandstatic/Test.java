package com.mindtree.defaultandstatic;

public class Test implements A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.m1();
		t.m2();
		A.m3();
	}

//	@Override
//	public void m2() {
//		System.out.println("m2 from Test");
//	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 from Test");
	}

}
