package com.sysrs.jobreadiness.corejava.object;

/**
 * A constructor is a special method that initializes the attributes of an
 * object when it is created.
 *
 */
public class ConstructorDemo {
	String name;
	int noOfFaculty;
	int year;

	// Default Constructor
	public ConstructorDemo() {

		System.out.println("In Default Constrructor");
	}

	// Parameterized Constructor
	public ConstructorDemo(String name, int noOfFaculty, int year) {
		super();
		this.name = name;
		this.noOfFaculty = noOfFaculty;
		this.year = year;
		System.out.println("In Parameterized Constrructor");
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", noOfFaculty=" + noOfFaculty + ", year=" + year + "]";
	}

	public static void main(String[] args) {
		// Calling default constructor
		ConstructorDemo constructor = new ConstructorDemo();
		// Setting values with the help of object
		constructor.name = "Osmania";
		constructor.noOfFaculty = 100;
		constructor.year = 1999;
		System.out.println(constructor.toString());
		// Setting values and calling default parameterized constructor
		ConstructorDemo constructor2 = new ConstructorDemo("JNTU", 24, 2023);
		System.out.println(constructor2.toString());
	}
}
