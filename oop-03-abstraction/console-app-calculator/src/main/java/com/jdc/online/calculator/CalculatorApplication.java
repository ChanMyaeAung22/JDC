package com.jdc.online.calculator;

import com.jdc.console.app.AbstractFeature;
import com.jdc.console.app.ConsoleApplication;
import com.jdc.online.feature.AbstractCalculation;
import com.jdc.online.feature.FeatureForAdding;
import com.jdc.online.feature.FeatureForDivision;
import com.jdc.online.feature.FeatureForMutliplication;
import com.jdc.online.feature.FeatureForSubstraction;

public class CalculatorApplication {

	public static void main(String[] args) {

		var application = new ConsoleApplication("Calculator", new FeatureForAdding(1), new FeatureForSubstraction(2),
				new FeatureForMutliplication(3), new FeatureForDivision(4),
				new AbstractCalculation(5, "Modulus Calculation") {

					@Override
					protected void calculateAndShowResult(int digit1, int digit2) {
						System.out.printf("%d %% %d = %d%n", digit1, digit2, digit1 % digit2);
					}
				});
		application.launch();
	}
}
