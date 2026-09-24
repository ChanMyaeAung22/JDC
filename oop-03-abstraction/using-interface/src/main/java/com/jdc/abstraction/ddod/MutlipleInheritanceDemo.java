package com.jdc.abstraction.ddod;

public class MutlipleInheritanceDemo {

}

interface A {
	void a();
	
	default void problem() {
		System.out.println("This is problem form A");
	}
}

interface B extends A{
	void b();
	
	default void problem() {
		System.out.println("This is problem form B");
	}
}

interface C extends A
{
	void c();
	
	default void problem() {
		System.out.println("This is problem form C");
	}
}

interface D extends B, C {
	void d();

	default void problem() {
		C.super.problem();
	}
}