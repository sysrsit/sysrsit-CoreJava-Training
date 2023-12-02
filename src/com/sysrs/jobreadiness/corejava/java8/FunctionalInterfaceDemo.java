package com.sysrs.jobreadiness.corejava.java8;

import java.util.function.*;

/**
 * A functional interface in Java is an interface that contains only one
 * abstract method
 *
 */

//Step 1: Creating a Functional Interface
@FunctionalInterface
interface MathOperation {
	int operate(int a, int b);

	// results in a compilation error due to the @FunctionalInterface annotation
	// void anotherMethod();
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// Step 2: Using predefined functional interfaces

		// Predicate: Represents a predicate (boolean-valued function) of one argument
		Predicate<Integer> isEven = num -> num % 2 == 0;
		System.out.println("Is 4 even? " + isEven.test(4));

		// Function: Represents a function that takes one argument and produces a result
		Function<Integer, String> intToString = Object::toString;
		System.out.println("String representation of 42: " + intToString.apply(42));

		// Consumer: Represents an operation that accepts a single input argument and
		// returns no result
		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
		printUpperCase.accept("hello");

		// Supplier: Represents a supplier of results
		Supplier<Double> randomValue = Math::random;
		System.out.println("Random value: " + randomValue.get());

		// Step 3: Using our custom functional interface

		// Lambda expression for MathOperation
		MathOperation addition = (a, b) -> a + b;
		System.out.println("Sum of 5 and 3: " + operate(5, 3, addition));

		// Step 4: Combining Predicates with and, or, negate methods
		Predicate<Integer> isGreaterThanTen = num -> num > 10;
		Predicate<Integer> isEvenAndGreaterThanTen = isEven.and(isGreaterThanTen);
		System.out.println("Is 12 even and greater than 10? " + isEvenAndGreaterThanTen.test(12));
	}

	// Step 3 (cont.): Using the custom functional interface
	private static int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operate(a, b);
	}
}
