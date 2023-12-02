package com.sysrs.jobreadiness.corejava.exceptionhandling;

/**
 * One try-catch block is placed inside another, enabling more granular
 * exception handling within the inner block.
 *
 */
public class InnerTryExample {

	public static void main(String[] args) {
		// Outer try block
		try {
			int[] numbers = { 1, 2, 3 };
			System.out.println("Array length: " + numbers.length);

			// Inner try block
			try {
				int result = numbers[5]; // This line will throw ArrayIndexOutOfBoundsException
				System.out.println("Result: " + result);
			} catch (ArrayIndexOutOfBoundsException innerException) {
				System.err.println("Inner Exception (ArrayIndexOutOfBoundsException): " + innerException.getMessage());
			}

			// Continue with the outer try block
			int quotient = 10 / 2; // This line is executed successfully
			System.out.println("Quotient: " + quotient);

		} catch (ArithmeticException outerException) {
			System.err.println("Outer Exception (ArithmeticException): " + outerException.getMessage());

		} finally {
			System.out.println("Finally block executed.");
		}
	}
}
