package com.sysrs.jobreadiness.corejava.abstraction;

/**
 * An abstract class cannot be instantiated and may contain abstract methods it
 * provides a blueprint for its subclasses to implement
 */

abstract class Shape {
	// Abstract method (to be implemented by subclasses)
	abstract double calculateArea();

	// Concrete method
	void display() {
		System.out.println("This is a shape.");
	}
}

//Concrete subclass 1
class Circle extends Shape {

	double radius;
	double area;

	// Constructor with radius as parameter
	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double calculateArea() {
		area = Math.PI * radius * radius;
		return area;
	}
}

//Concrete subclass 2
class Rectangle extends Shape {
	double length;
	double width;
	double area;

	// Constructor with length and width as parameter
	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	double calculateArea() {
		area = length * width;
		return area;
	}
}

public class AbstractClassDemo {
	public static void main(String[] args) {
		// Creating objects of concrete subclasses
		Circle circle = new Circle(5.0);
		// Calling methods on objects
		circle.display();
		System.out.println("Area of Circle: " + circle.calculateArea());
		System.out.println();
		Rectangle rectangle = new Rectangle(4.0, 6.0);
		rectangle.display();
		System.out.println("Area of Rectangle: " + rectangle.calculateArea());
	}
}
