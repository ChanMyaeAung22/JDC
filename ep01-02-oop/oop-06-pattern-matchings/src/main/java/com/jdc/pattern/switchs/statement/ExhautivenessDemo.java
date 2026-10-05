package com.jdc.pattern.switchs.statement;

import com.jdc.pattern.switchs.Rectangle;
import com.jdc.pattern.switchs.Shape;
import com.jdc.pattern.switchs.Square;
import com.jdc.pattern.switchs.Triangle;
import com.jdc.pattern.switchs.enums.Card;
import com.jdc.pattern.switchs.enums.GameCard;
import com.jdc.pattern.switchs.enums.TarotCard;

public class ExhautivenessDemo {
	
	public static void statementForRecord(Shape shape) {
		switch (shape) {
		case Square s -> System.out.println("");
		case Rectangle r -> System.out.println("");
		case Triangle t -> System.out.println("");
		}
	}

	public static void statementForInf(Card card) {
		switch (card) {
		case GameCard gc -> System.out.println(gc.name());
		case TarotCard tc -> System.out.println(tc.name());
		}
	}
	
	public static String expressionForRecord(Shape shape) {
		return switch (shape) {
		case Square s -> "";
		case Rectangle r -> "";
		case Triangle t -> "";
		};
	}
	
	public static String expressionForInf(Card card) {
		return switch (card) {
		case GameCard gc -> "";
		case TarotCard tc -> "";
		};
	}
	
	public static void statementForEnumConst(Card card) {
		switch (card) {
		case GameCard.Spade -> System.out.println();
		case GameCard.Heart -> System.out.println();
		case GameCard.Diamond -> System.out.println();
		case GameCard.Clover -> System.out.println();
		case TarotCard.Angel -> System.out.println();
		case TarotCard.Saint -> System.out.println();
		case TarotCard.People -> System.out.println();
		case TarotCard.Demon -> System.out.println();
		default -> System.out.println("");
		}
	}

	public static void demoForInt(int value) {
		switch (value) {
		case 0 -> System.out.println("Zero");
		case 1 -> System.out.println("One");
		}
	}

	public static void demoForInt(Type value) {
		switch (value) {
		case One -> System.out.println("Zero");
		case Two -> System.out.println("One");
		}
	}

	public static String expressionForInt(int value) {
		return switch (value) {
		case 0 -> "Zero";
		case 1 -> "One";
		default -> "Others";
		};
	}

	public static String expressionForEnum(Type value) {
		return switch (value) {
		case One -> "Zero";
		case Two -> "One";
		case Three -> "Three";
		};
	}

	public enum Type {
		One, Two, Three
	}
}
