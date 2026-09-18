package com.jdc.demo.override;

public class RaceCar extends Car{

	@Override // just to check
	public void drive() {
		System.out.println("I am driving very fast");
	}
	
	public void turbonOn() {
		System.out.println("Yee ha");
	}
	 
}
