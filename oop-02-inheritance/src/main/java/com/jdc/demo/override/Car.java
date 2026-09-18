package com.jdc.demo.override;

public class Car {
	
	private String type;
	{
		System.out.println("Init Block of Car");
	}
	
	public Car() {
		super();
		this.type = "Car";
		System.out.println("Default Constructor of Car");
	}
	
	public Car(String type) {
		super();
		this.type = type;
	}
	
	private void secretMethod() {
		System.out.println("This is secret method");
	}

	public void drive() {
		System.out.printf("%s is driving%n", type);
	}
	
	public void park() {
		System.out.printf("%s is parking%n", type);
	}
	
	private void test() {
		
	}
}
