package com.jdc.demo.override;

import org.junit.jupiter.api.Test;

import com.jdc.demo.override.Car;
import com.jdc.demo.override.RaceCar;

public class OverrideTest {
	
	@Test
	void test() {
		Car car1 = new Car();
		RaceCar car2 = new RaceCar();
		
		test(car1);
		System.out.println("-----------------");
		test(car2);
	}

	void test(Car car) {
		car.drive();
	}
}
