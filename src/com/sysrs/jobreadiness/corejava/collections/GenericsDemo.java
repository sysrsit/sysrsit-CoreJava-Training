package com.sysrs.jobreadiness.corejava.collections;

import java.util.ArrayList;
import java.util.List;

import com.sysrs.jobreadiness.corejava.helperclass.Box;

/**
 * Generics in Java helps developers to create classes and methods that can work
 * with various data types without explicitly specifying them.
 */

public class GenericsDemo {

	public static void main(String[] args) {
		// Using a generic class
		Box<Integer> integerBox = new Box<>(42);
		Box<String> stringBox = new Box<>("Hello, Generics!");

		// Accessing values from generic class
		int intValue = integerBox.getValue();
		String stringValue = stringBox.getValue();

		System.out.println("Integer Box Value: " + intValue);
		System.out.println("String Box Value: " + stringValue);

		// Using a generic method
		Integer[] integerArray = { 1, 2, 3, 4, 5 };
		String[] stringArray = { "one", "two", "three", "four", "five" };

		printArray(integerArray);
		printArray(stringArray);

		// Using wildcard in generic method
		List<Integer> integerList = new ArrayList<>();
		integerList.add(10);
		integerList.add(20);
		integerList.add(30);

		List<String> stringList = new ArrayList<>();
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Cherry");

		printList(integerList);
		printList(stringList);
	}

	// Generic method to print an array
	private static <E> void printArray(E[] array) {
		for (E element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	// Generic method to print a list
	private static void printList(List<?> list) {
		for (Object element : list) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
