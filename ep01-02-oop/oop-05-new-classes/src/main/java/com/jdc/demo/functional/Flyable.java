package com.jdc.demo.functional;

public interface Flyable {
	
	void fly();
	
	void hello();
	
	default void test() {
		
	}
}
