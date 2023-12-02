package com.sysrs.jobreadiness.corejava.acessspecifiers;

/**
 * The default access specifier in Java is package-private .
 *
 */

public class DefaultDemo {
	String name = "Default Example";

	void display() {
		System.out.println("This is a default-access method " + name);
	}

	public static void main(String[] args) {
		// Creating an instance of the class with default access modifier
		DefaultDemo obj = new DefaultDemo();
		// Accessing default-access method
		obj.display();
	}
}
