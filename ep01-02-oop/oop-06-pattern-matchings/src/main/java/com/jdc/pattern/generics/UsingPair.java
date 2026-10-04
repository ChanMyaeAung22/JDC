package com.jdc.pattern.generics;

import java.util.Date;

public class UsingPair {

	public static void use(PairInf<String, Date> pair) {

		if (pair instanceof Pair<String, Date>(var key, var value)) {

		}
	}

	public static void use(Container<Container<String>> data) {
		
//		data.value().value();

		if (data instanceof Container(Container(var value))) {

		}
	}
}
