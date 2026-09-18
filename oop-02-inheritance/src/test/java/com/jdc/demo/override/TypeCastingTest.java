package com.jdc.demo.override;

import org.junit.jupiter.api.Test;

import com.jdc.demo.override.Car;
import com.jdc.demo.override.TruckCar;

public class TypeCastingTest {

	@Test
	void test_implicit_casting() {
		Car car = new TruckCar();
		car.drive();
	}
	
	@Test
	void test_explicit_testing() {
		Car car = new Car();
		
		
		
		TruckCar truck = (TruckCar)car;
		truck.drive();
	}
}
