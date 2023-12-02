package com.sysrs.jobreadiness.corejava.collections;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet is a collection that utilizes a hash table to store unique elements
 * and provides constant-time access on average.
 *
 */
public class HashSetDemo {

	public static void main(String[] args) {

		// Creating a HashSet using default constructor
		HashSet<String> fruits = new HashSet<>();

		// Adding elements to the HashSet using add() method
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Grape");

		// Checking if an element exists
		System.out.println("Does HashSet contain 'Apple'? " + fruits.contains("Apple"));

		// Removing an element
		fruits.remove("Banana");
		System.out.println("HashSet after removing 'Banana': " + fruits);

		// Checking the size of the HashSet
		System.out.println("Size of HashSet: " + fruits.size());

		// Iterating over the HashSet
		System.out.println("Contents of HashSet:");
		Iterator<String> iterator = fruits.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Adding duplicate elements
		fruits.add("Apple");
		fruits.add("Grape");
		System.out.println("HashSet after adding duplicate elements: " + fruits);

		// Converting a HashSet to an array
		String[] fruitArray = fruits.toArray(new String[fruits.size()]);
		System.out.println("Array representation of HashSet: ");
		for (String fruit : fruitArray) {
			System.out.println(fruit);
		}

		// Clearing the HashSet
		fruits.clear();
		System.out.println("HashSet after clearing: " + fruits);

		// Checking if the HashSet is empty
		System.out.println("Is HashSet empty? " + fruits.isEmpty());
	}
}
