package com.jdc.exceptions.demo;

public class Class1 {

	private Class2 instance;
	
	public Class1() {
		instance = new Class2();
	}
	
	public int divide(int a, int b) {
		
		System.out.println("Class 1 Work");
		
		int value  = instance.divide(a, b);
		
		System.out.println("Class 1 Work End");
		
		return value;
	}
}
