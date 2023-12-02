package com.sysrs.jobreadiness.corejava.coreconcepts;

import java.math.BigDecimal;

/**
 * Wrapper classes are used to work with primitive data types as objects
 *
 */

public class WrapperClasses {

	public static void main(String[] args) {

		// Integer wrapper class
		Integer intWrapper = 42; // Autoboxing
		int intValue = intWrapper; // Unboxing
		System.out.println("Integer Wrapper: " + intWrapper);
		System.out.println("Unboxed Integer Value: " + intValue);

		// Double wrapper class
		double doubleValue = 3.14; // Unboxing
		Double doubleWrapper = doubleValue; // Autoboxing
		System.out.println("Double Wrapper: " + doubleWrapper);
		System.out.println("Unboxed Double Value: " + doubleValue);

		// Upcasting (Automatic or Widening)
		Integer int_Value = 42; // int to Integer (Auto-boxing)
		Object objValue = int_Value; // Integer to Object (Upcasting)
		System.out.println("Upcasting - Integer to Object: " + objValue);

		// Downcasting (Explicit or Narrowing)
		Object anotherObjValue = 78; // int to Object (Auto-boxing)
		Integer anotherIntValue = (Integer) anotherObjValue; // Object to Integer (Downcasting)
		System.out.println("Downcasting - Object to Integer:" + anotherIntValue);

		// conversion of strings to primitive types
		String numStr = "123";
		int parsedInt = Integer.parseInt(numStr);
		double parsedDouble = Double.parseDouble(numStr);
		System.out.println("Parsed Integer from String: " + parsedInt);
		System.out.println("Parsed Integer from String: " + parsedDouble);

		// Creating wrapper objects using constructors
		Integer customIntWrapper = 55;
		System.out.println("Custom Integer Wrapper: " + customIntWrapper);

		// BIGDECIMAL AND DECIMAL
		BigDecimal bigDecimalValue1 = new BigDecimal("10.5");
		BigDecimal bigDecimalValue2 = new BigDecimal("5.3");
		System.out.println("BigDecimal Example:");
		System.out.println("Sum: " + bigDecimalValue1.add(bigDecimalValue2));
		System.out.println("Product: " + bigDecimalValue1.multiply(bigDecimalValue2));

		// Using Double for regular decimal arithmetic
		Double doubleValue1 = 10.5;
		Double doubleValue2 = 5.3;
		System.out.println("\nDouble Example:");
		System.out.println("Sum: " + doubleValue1 + doubleValue2);
		System.out.println("Product: " + doubleValue1 * doubleValue2);

		// Wrapper classes provide useful methods
		System.out.println("Maximum Value of Integer: " + Integer.MAX_VALUE);
		System.out.println("Minimum Value of Integer: " + Integer.MIN_VALUE);
		System.out.println("Minimum Value of Integer: " + Integer.max(12, 9));
	}
}
