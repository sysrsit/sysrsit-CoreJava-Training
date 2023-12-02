package com.sysrs.jobreadiness.corejava.exceptionhandling;

/**
 * A custom exception is a user-defined exception class allows developers to
 * create application-specific exception.
 *
 */

class InvalidAgeException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String str) {
		// calling the constructor of parent Exception
		super(str);
	}
}

public class CustomException {
	static void validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("age is not valid to vote");
		} else {
			System.out.println("welcome to vote");
		}
	}

	public static void main(String args[]) {
		try {
			validate(13);
		} catch (InvalidAgeException ex) {
			System.out.println("Caught the exception");

			System.out.println("Exception occured: " + ex);
		}

		System.out.println("rest of the code...");
	}
}
