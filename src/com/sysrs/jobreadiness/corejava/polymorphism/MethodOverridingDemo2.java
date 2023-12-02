package com.sysrs.jobreadiness.corejava.polymorphism;

/**
 * Method overriding occurs when a subclass provides a different implementation
 * for a method that exists in its superclass.
 *
 */
class Figure {
	public double calculateArea() {
		return 0;
	}

	// Covariant return types
	// Method in the superclass with return type Figure.
	Figure getDetails() {
		System.out.println("Details of a Figure.");
		return new Figure();
	}
}

class CircleDemo extends Figure {
	@Override
	public double calculateArea() {
		double radius = 2.0;
		return Math.PI * radius * radius;
	}

	// Method in the subclass overrides the method in the superclass with a more
	// specific return type
	@Override
	CircleDemo getDetails() {
		System.out.println("Details of a circle.");
		return new CircleDemo();
	}
}

class RectangleDemo extends Figure {
	@Override
	public double calculateArea() {
		double length = 5.0;
		double width = 3.0;
		return length * width;
	}
}

public class MethodOverridingDemo2 {
	public static void main(String[] args) {
		Figure[] figures = { new CircleDemo(), new RectangleDemo() };

		for (Figure fig : figures) {
			System.out.println("Area of " + fig.getClass().getName() + ": " + fig.calculateArea());
		}

		Figure figure = new Figure();
		Figure figureDetails = figure.getDetails();
		System.out.println("Returned type: " + figureDetails.getClass().getSimpleName());

		CircleDemo circle = new CircleDemo();
		CircleDemo circleDetails = circle.getDetails();
		System.out.println("Returned type: " + circleDetails.getClass().getSimpleName());
	}
}
