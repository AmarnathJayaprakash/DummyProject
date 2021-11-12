package com.package1.com;

public class DummyClass2 extends DummyClass1{
	
	@Override
	public int subMethods(int a, int b) {
		return super.subMethods(a, b);
	}

	
	public static void main(String[] args) {
		DummyClass1 obj = new DummyClass2();
		int result = obj.subMethods(8,5);
		System.out.println(result);
	}

}
