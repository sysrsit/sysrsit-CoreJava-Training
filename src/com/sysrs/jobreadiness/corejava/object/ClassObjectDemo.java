package com.sysrs.jobreadiness.corejava.object;

/**
 * Classes are used in encapsulating data and behavior into reusable units.
 *
 */
public class ClassObjectDemo {
	// instance variables
	String name;
	String department;
	int age;

	// Displaying the values of each variable
	public String toString() {
		return "Student [name=" + name + ", department=" + department + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// ClassName objectName = new ClassName();
		// object is created
		ClassObjectDemo classObjectDemo = new ClassObjectDemo();
		classObjectDemo.name = "Ram";
		classObjectDemo.department = "Computer Science";
		classObjectDemo.age = 40;
		System.out.println(classObjectDemo.toString());
	}
}
