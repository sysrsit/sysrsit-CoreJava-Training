package com.sysrs.jobreadiness.corejava.polymorphism;

/**
 * Method hiding occurs when a subclass declares a static method with the same
 * signature as a static method in its superclass, effectively overriding the
 * superclass method at compile time.
 */

//Method hiding
class Parent {
	static void staticMethod() {
		System.out.println("Static method in Parent class.");
	}
}

class Child extends Parent {
	static void staticMethod() {
		System.out.println("Static method in Child class.");
	}
}

public class MethodHiding {
	public static void main(String[] args) {
		// Static methods hide the superclass method rather than override it
		Parent.staticMethod(); // Calls the static method in Parent class

		// it will invoke the static method in the Child class, not override the method
		// in the Parent class.
		Child.staticMethod(); // Calls the static method in Child class
	}
}
