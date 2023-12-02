package com.sysrs.jobreadiness.corejava.exceptionhandling;

/**
 * Multiple catch blocks allow handling different types of exceptions within the
 * same try-catch structure.
 *
 */
public class MultipleCatchExample {

	public static void main(String[] args) {
		try {
			// Simulating an array index out of bounds exception
			int[] numbers = { 1, 2, 3 };
			int result = numbers[5]; // This line will throw ArrayIndexOutOfBoundsException
			
			// Simulating a division by zero exception
			int quotient = 10 / 0; // This line will throw ArithmeticException
			System.out.println(result + "    " + quotient);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.err.println("ArithmeticException: " + e.getMessage());
		} catch (Exception e) {
			// Generic catch block for handling other exceptions
			System.err.println("Exception: " + e.getMessage());
		} finally {
			System.out.println("Finally block executed.");
		}
	}
}
