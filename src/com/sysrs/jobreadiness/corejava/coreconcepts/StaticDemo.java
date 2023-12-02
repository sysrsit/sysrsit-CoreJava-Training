package com.sysrs.jobreadiness.corejava.coreconcepts;

/**
 * Static variable and method that are shared by all instances of the class.
 *
 */
public class StaticDemo {
	// Static Variable
	static String CompanyName = "SYSRS";
	// Non Static variable
	String Training = "Development";

	public StaticDemo() {
		System.out.println("In Default cnostructor");
	}

	public StaticDemo(String training) {
		super();
		Training = training;
	}

	// Static method
	static void staticMethod() {
		System.out.println("This is a static method.");
		// Accessing static variable within a static method
		System.out.println("Static Variable: " + CompanyName);
		// System.out.println("Non Static Variable: " + DepartmentName);
		// Error as can't access instance variables
	}

	// It runs once when the class is loaded
	// Executes before constructor
	static {
		System.out.println("This is a static block.");
		// Can perform some initialization or setup here
	}

	public static void main(String[] args) {
		// Calling the static method and variable without creating an instance of the
		// class
		StaticDemo.CompanyName = "SYSRS IT Services";
		StaticDemo.staticMethod();

	}
}
