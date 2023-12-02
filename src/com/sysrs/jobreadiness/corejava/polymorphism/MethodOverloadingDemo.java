package com.sysrs.jobreadiness.corejava.polymorphism;

/**
 * Method overloading allows a class to have multiple methods with the same name
 * but different parameters.
 *
 */
class Addition {

	// Method with two parameters
	public int add(int a, int b) {
		return a + b;
	}

	// Method with two parameters but different return type
	public double add(double a, double b) {
		return a + b;
	}

	// Method with three parameters
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	// Method with two string parameters
	public String add(String str1, String str2) {
		// Strings concatination
		return str1 + str2;
	}

}

public class MethodOverloadingDemo {

	private int sub(int a, int b) {
		return a - b;
	}

	// Method with two parameters
	private double sub(double a, double b) {
		return a - b;
	}

	public static void main(String[] args) {

		Addition addition = new Addition();

		System.out.println("Sum of two integer numbers: " + addition.add(5, 7));
		System.out.println("Sum of two double numbers: " + addition.add(5.1, 7.1));
		System.out.println("Sum of three integer numbers: " + addition.add(5, 7, 3));
		System.out.println("Sum of two strings: " + addition.add("Sahasra", "Kamatam"));

		MethodOverloadingDemo substraction = new MethodOverloadingDemo();
		System.out.println("Sub of two integer numbers: " + substraction.sub(7, 5));
		System.out.println("Sum of three integer numbers: " + substraction.sub(5.2, 7.4));

	}

}
