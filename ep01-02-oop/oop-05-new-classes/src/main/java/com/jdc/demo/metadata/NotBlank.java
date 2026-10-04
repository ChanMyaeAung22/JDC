package com.jdc.demo.metadata;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({ TYPE, FIELD })
public @interface NotBlank {

	// Primitive & String and their array
	String message() default "Field must not be blank value";
	
	int value();
 }
