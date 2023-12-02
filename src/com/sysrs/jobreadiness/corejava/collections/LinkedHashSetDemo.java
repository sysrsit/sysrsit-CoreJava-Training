package com.sysrs.jobreadiness.corejava.collections;

import java.util.LinkedHashSet;
import java.util.Iterator;

/**
 * LinkedHashSet is an ordered collection that maintains the insertion order of
 * elements while ensuring uniqueness like HashSet.
 *
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {

		// Creating a LinkedHashSet using default constructor
		LinkedHashSet<String> fruits = new LinkedHashSet<>();

		// Adding elements to the LinkedHashSet using add() method
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Grape");

		// Checking if an element exists using contains() method
		System.out.println("Does LinkedHashSet contain 'Apple'? " + fruits.contains("Apple"));

		// Removing an element using remove() method
		fruits.remove("Banana");
		System.out.println("LinkedHashSet after removing 'Banana': " + fruits);

		// Checking the size of the LinkedHashSet using size() method
		System.out.println("Size of LinkedHashSet: " + fruits.size());

		// Iterating over the LinkedHashSet using iterator() and hasNext() methods
		System.out.println("Contents of LinkedHashSet:");
		Iterator<String> iterator = fruits.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Adding duplicate elements
		fruits.add("Apple");
		fruits.add("Grape");
		System.out.println("LinkedHashSet after adding duplicate elements: " + fruits);

		// Maintaining insertion order
		System.out.println("Elements in LinkedHashSet maintain insertion order:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// Converting a LinkedHashSet to an array
		String[] fruitArray = fruits.toArray(new String[fruits.size()]);
		System.out.println("Array representation of LinkedHashSet: ");
		for (String fruit : fruitArray) {
			System.out.println(fruit);
		}

		// Clearing the LinkedHashSet using clear() method
		fruits.clear();
		System.out.println("LinkedHashSet after clearing: " + fruits);

		// Checking if the LinkedHashSet is empty using isEmpty() method
		System.out.println("Is LinkedHashSet empty? " + fruits.isEmpty());
	}
}
