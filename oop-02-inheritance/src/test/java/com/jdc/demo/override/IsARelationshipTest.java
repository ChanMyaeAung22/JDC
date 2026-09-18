package com.jdc.demo.override;

import org.junit.jupiter.api.Test;

import com.jdc.demo.override.Car;
import com.jdc.demo.override.TruckCar;

public class IsARelationshipTest {
	
	@Test
	void test() {
		var car = new Car();
		var truck = new TruckCar();
		
		testDrive(car);
		testDrive(truck);
	}

	void testDrive(Car car) {
		car.drive();
		car.park();
		
		if(car instanceof TruckCar) {
			TruckCar truck = (TruckCar)car;
			truck.loading();
		}
	}
}
