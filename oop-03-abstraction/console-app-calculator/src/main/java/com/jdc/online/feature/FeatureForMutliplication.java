package com.jdc.online.feature;

public class FeatureForMutliplication extends AbstractCalculation {

	public FeatureForMutliplication(int id) {
		super(id, "Multiply Calculation");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void calculateAndShowResult(int digit1, int digit2) {
		System.out.printf("%d * %d = %d%n",digit1, digit2, digit1 * digit2);
	}

}
