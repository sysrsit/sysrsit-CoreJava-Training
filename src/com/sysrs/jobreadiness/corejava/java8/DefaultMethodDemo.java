package com.sysrs.jobreadiness.corejava.java8;

/**
 * Default methods allows to add new methods to an interface without breaking
 * existing implementations.
 */
interface MyInterface {
	// Abstract method
	void myAbstractMethod();

	// Default method
	default void myDefaultMethod() {
		System.out.println("Default implementation of myDefaultMethod in MyInterface");
	}

	// Static method
	static void myStaticMethod() {
		System.out.println("Static method in MyInterface");
	}
}

interface AnotherInterface {
	// Default method
	default void anotherDefaultMethod() {
		System.out.println("Default implementation of anotherDefaultMethod in AnotherInterface");
	}
}

// Concrete class implementing multiple interfaces
class MyClass implements MyInterface, AnotherInterface {
	@Override
	public void myAbstractMethod() {
		System.out.println("Concrete implementation of myAbstractMethod in MyClass");
	}

	// Overriding the default method from MyInterface
	@Override
	public void myDefaultMethod() {
		System.out.println("Overridden implementation of myDefaultMethod in MyClass");
	}
}

public class DefaultMethodDemo {
	public static void main(String[] args) {
		// Creating an instance of MyClass
		MyClass myClass = new MyClass();

		// Calling abstract and default methods
		myClass.myAbstractMethod();
		myClass.myDefaultMethod();

		// Calling default method from AnotherInterface
		myClass.anotherDefaultMethod();

		// Calling static method in MyInterface
		MyInterface.myStaticMethod();
	}
}
