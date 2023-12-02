package com.sysrs.jobreadiness.corejava.acessspecifiers;

/**
 * The protected access specifier in Java allows access to a class member within
 * the same class, subclasses within the same package, and subclasses in
 * different packages
 */

// Parent class with protected access modifier
class ParentClass {
	// Protected variable
	protected int protectedVariable = 30;
	// Public variable
	public int publicVariable = 12000;

	// Protected method
	protected void protectedMethod() {
		System.out.println("This is a protected method in the parent class.");
	}
}

// Child class extending the parent class
class ChildClass extends ParentClass {
	// Public method to access protected members of the parent class
	public void accessProtectedMembers() {
		// Accessing the protected variable and method from the parent class
		System.out.println("Protected Variable (from Parent): " + protectedVariable);
		// Error as accessing private member of other class
		// System.out.println("Private Variable (from Parent): " + privateVariable);
		System.out.println("Public Variable (from Parent): " + publicVariable);
		protectedMethod();
	}
}

// Main class
public class ProtectedDemo {
	public static void main(String[] args) {

		ChildClass child = new ChildClass();
		// Accessing the public method in the child class to indirectly access protected
		// members
		child.accessProtectedMembers();
	}
}
