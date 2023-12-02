package com.sysrs.jobreadiness.corejava.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	private void handleArithmeticException(int numerator, int denominator) {
		try {
			int result = numerator / denominator;
			System.out.println("Result of division: " + result);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

	private void handleArrayIndexOutOfBounds() {
		try {
			int[] numbers = { 1, 2, 3, 4, 5 };
			int index = 10;
			int element = numbers[index]; // This line may throw ArrayIndexOutOfBoundsException
			System.out.println("Element at index " + index + ": " + element);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
			System.err.println("StackTrace: ");
			e.printStackTrace();
		}
	}

	private void handleClassNotFoundException() {
		try {
			// Attempting to dynamically load a class that does not exist
			Class<?> dynamicClass = Class.forName("com.example.NonExistentClass");
			System.out.println("Class loaded: " + dynamicClass.getName());
		} catch (ClassNotFoundException e1) {
			System.err.println("ClassNotFoundException: " + e1.getMessage());
			System.err.println("StackTrace: ");
			e1.printStackTrace();
		}
	}

	private void handleInvalidIntegerInput() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter an integer: ");
			// This line may throw InputMismatchException if we don't enter an integer value
			int userInput = scanner.nextInt();
			System.out.println("User input: " + userInput);
		} catch (InputMismatchException e) {
			System.err.println("InputMismatchException: " + e.getMessage());
			System.err.println("StackTrace: ");
			e.printStackTrace();
		}
	}

	private void handleNullReference() {
		try {
			// Attempting to access a method or field on a null object
			String nullString = null;
			@SuppressWarnings("null")
			int length = nullString.length(); // This line will throw NullPointerException
			System.out.println("Length of nullString: " + length);
		} catch (NullPointerException e) {
			System.err.println("NullPointerException: " + e.getMessage());
			System.err.println("StackTrace: ");
			e.printStackTrace();
		}
	}
	
	private void handleInvalidNumberFormat() {
		try {
			String invalidDoubleString = "12.34.56";
			double parsedValue = Double.parseDouble(invalidDoubleString); // This line may throw NumberFormatException
			System.out.println("Parsed double value: " + parsedValue);
		} catch (NumberFormatException e) {
			System.err.println("NumberFormatException: " + e.getMessage());
			System.err.println("StackTrace: ");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ExceptionHandlingDemo exceptionHandlingDemo=new ExceptionHandlingDemo();
		//Division by zero.
		exceptionHandlingDemo.handleArithmeticException(10, 0);
		//Accessing an element at an index that is out of bounds.
		exceptionHandlingDemo.handleArrayIndexOutOfBounds();
		//Load a class that doesn't exist.
		exceptionHandlingDemo.handleClassNotFoundException();
		// Input doesn't match
		exceptionHandlingDemo.handleInvalidIntegerInput();
		// Accessing Null Object
		exceptionHandlingDemo.handleNullReference();
		// Convert a string with an incorrect format to a numeric value.
		exceptionHandlingDemo.handleInvalidNumberFormat();
	}
}
