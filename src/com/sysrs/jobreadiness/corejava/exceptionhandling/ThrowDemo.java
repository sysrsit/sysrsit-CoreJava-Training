package com.sysrs.jobreadiness.corejava.exceptionhandling;

/**
 * throw keyword is used to explicitly raise an exception from a method or block
 * of code.
 *
 */
public class ThrowDemo {

	static void fun() {
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {
			System.out.println("Caught inside fun().");
			throw e; // rethrowing the exception
		}
	}

	public static void main(String args[]) {
		try {
			fun();
		} catch (NullPointerException e) {
			System.out.println("Caught in main." + e);
		}
	}

}
