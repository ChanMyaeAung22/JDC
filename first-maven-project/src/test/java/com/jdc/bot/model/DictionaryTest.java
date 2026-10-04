package com.jdc.bot.model;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(value = OrderAnnotation.class)
public class DictionaryTest {
	
	private static Dictionary dict = new Dictionary();
	
	@Order(1)
	@ParameterizedTest
	@CsvSource(value = {
		"How are you\\tI am fine, thatnk you.\\t1"
	}, delimiter = '\t')
	void test_register(String question, String answer, int size) {
		int result = dict.register(question, answer);
		assertEquals(size, result);
	}
	
	@Test
	void test_search() {
		System.out.println("Test Two");
	}
}