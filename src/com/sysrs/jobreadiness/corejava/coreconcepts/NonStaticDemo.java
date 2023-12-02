package com.sysrs.jobreadiness.corejava.coreconcepts;

/**
 * Non-static method and variable, is associated with an object and requires an
 * object of the class for it to be called.
 *
 */
public class NonStaticDemo {

	// Static Variable
	static String CompanyName = "SYSRS";
	// Non Static variable
	String Training = "Development";

	// Instance method
	public void instanceMethod() {
		System.out.println("This is an instance method.");
		// Accessing both static and instance variables within an instance method
		System.out.println("Static Variable: " + CompanyName);
		System.out.println("Non Static Variable: " + Training);
	}

	public static void main(String[] args) {
		NonStaticDemo instance1 = new NonStaticDemo();
		instance1.Training = "Consulting";
		// Calling the instance method using the instance
		instance1.instanceMethod();
		// Creating another instance of the class
		NonStaticDemo instance2 = new NonStaticDemo();
		instance2.Training = "Devops";

		System.out.println("Instance1 Variable: " + instance1.Training);
		System.out.println("Instance2 Variable: " + instance2.Training);

	}

}
