package com.sysrs.jobreadiness.corejava.collections;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet is an implementation of SortedSet interface that uses a tree data
 * structure to store unique elements in ascending order according to their
 * natural ordering or a custom comparator.
 *
 */
public class TreeSetDemo {

	public static void main(String[] args) {

		// Creating a TreeSet using default constructor
		TreeSet<String> fruits = new TreeSet<>();

		// Adding elements to the TreeSet using add() method
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Grape");

		// Checking if an element exists using contains() method
		System.out.println("Does TreeSet contain 'Apple'? " + fruits.contains("Apple"));

		// Removing an element using remove() method
		fruits.remove("Banana");
		System.out.println("TreeSet after removing 'Banana': " + fruits);

		// Checking the size of the TreeSet using size() method
		System.out.println("Size of TreeSet: " + fruits.size());

		// Iterating over the TreeSet using iterator() and hasNext() methods
		System.out.println("Contents of TreeSet:");
		Iterator<String> iterator = fruits.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Retrieving the first and last elements using first() and last() methods
		System.out.println("First element: " + fruits.first());
		System.out.println("Last element: " + fruits.last());

		// Finding the element lower than a given key using lower() method
		System.out.println("Element lower than 'Orange': " + fruits.lower("Orange"));

		// Finding the element higher than a given key using higher() method
		System.out.println("Element higher than 'Apple': " + fruits.higher("Apple"));

		// Checking if a subset exists using containsAll() method
		TreeSet<String> subset = new TreeSet<>();
		subset.add("Apple");
		subset.add("Orange");

		System.out.println("Does TreeSet contain subset 'Apple' and 'Orange'? " + fruits.containsAll(subset));

		// Adding all elements of a subset using addAll() method
		fruits.addAll(subset);
		System.out.println("TreeSet after adding subset: " + fruits);

		// Removing all elements of a subset using removeAll() method
		fruits.removeAll(subset);
		System.out.println("TreeSet after removing subset: " + fruits);

		// Clearing the TreeSet using clear() method
		fruits.clear();
		System.out.println("TreeSet after clearing: " + fruits);

		// Checking if the TreeSet is empty using isEmpty() method
		System.out.println("Is TreeSet empty? " + fruits.isEmpty());
	}
}
