package com.jdc.demo.override;

import org.junit.jupiter.api.Test;

import com.jdc.demo.override.Car;
import com.jdc.demo.override.TruckCar;

public class inheritanceTest {
	
	@Test
	void test() {
		System.out.println("Testing Car");
		var car = new Car();
		car.drive();
		car.park();
		
		System.out.println("-----------------");
		System.out.println("Testing Truck Car");
		var truck = new TruckCar();
		truck.drive();
		truck.park();
		
		truck.loading();
	}
}
