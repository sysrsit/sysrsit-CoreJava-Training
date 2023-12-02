package com.sysrs.jobreadiness.corejava.acessspecifiers;

/**
 * The private access specifier in Java restricts access to a class member to
 * only within the class itself.
 *
 */
class PrivateExample {
	// Private variable
	private int privateVariable = 20;

	// Private method
	private void privateMethod() {
		System.out.println("This is a private method.");
	}

	// Public method to access the private members
	public void accessPrivateMembers() {
		System.out.println("Private Variable: " + privateVariable);
		privateMethod();
	}
}

public class PrivateDemo {
	public static void main(String[] args) {
		PrivateExample privateExample = new PrivateExample();
		// Accessing the public method to indirectly access private members
		privateExample.accessPrivateMembers();
		// Attempting to access private members directly
		// System.out.println("Private Variable: " + privateExample.privateVariable);//error
		// privateExample.privateMethod();//error as accessing private member of another class
	}
}
