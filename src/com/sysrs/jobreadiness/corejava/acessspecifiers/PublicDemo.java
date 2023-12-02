package com.sysrs.jobreadiness.corejava.acessspecifiers;

/**
 * The public access specifier in Java grants unrestricted access to a class
 * member, allowing it to be accessed from anywhere within the program.
 */
public class PublicDemo {
	// Public variable
	public int publicVariable = 10;

	// Public method
	public void publicMethod() {
		System.out.println("This is a public method. " + publicVariable);
	}

	public static void main(String[] args) {
		// Creating an instance of the public class
		PublicDemo publicDemo = new PublicDemo();
		// Accessing the public variable and method
		System.out.println("Public Variable: " + publicDemo.publicVariable);
		publicDemo.publicMethod();
	}
}
