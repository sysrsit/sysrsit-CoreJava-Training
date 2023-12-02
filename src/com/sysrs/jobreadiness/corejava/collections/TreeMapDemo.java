package com.sysrs.jobreadiness.corejava.collections;

import java.util.*;

/**
 * TreeMap stores as key-value pairs and maintains the order of the keys based
 * on their natural ordering or a custom comparator.
 *
 */
public class TreeMapDemo {

	public static void main(String[] args) {

		// Creating a TreeMap using default constructor
		TreeMap<String, Integer> fruits = new TreeMap<>();

		// Adding key-value pairs using put() method
		fruits.put("Apple", 10);
		fruits.put("Orange", 15);
		fruits.put("Banana", 20);

		// Checking if a key exists using containsKey() method
		System.out.println("Does TreeMap contain 'Apple' key? " + fruits.containsKey("Apple"));

		// Getting the value of a key using get() method
		System.out.println("Value associated with 'Orange' key: " + fruits.get("Orange"));

		// Removing a key-value pair using remove() method
		fruits.remove("Banana");
		System.out.println("TreeMap after removing 'Banana' key: " + fruits);

		// Checking the size of the TreeMap using size() method
		System.out.println("Size of TreeMap: " + fruits.size());

		// Iterating over the TreeMap using entrySet() and iterator() methods
		System.out.println("Contents of TreeMap:");
		for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
			String fruit = entry.getKey();
			int quantity = entry.getValue();
			System.out.println("Key: " + fruit + ", Value: " + quantity);
		}

		// Getting the first and last key-value pairs using firstEntry() and lastEntry()
		// methods
		Map.Entry<String, Integer> firstEntry = fruits.firstEntry();
		System.out.println("First key-value pair: " + firstEntry.getKey() + ", " + firstEntry.getValue());

		Map.Entry<String, Integer> lastEntry = fruits.lastEntry();
		System.out.println("Last key-value pair: " + lastEntry.getKey() + ", " + lastEntry.getValue());

		// Replacing a value for a key using put() method
		fruits.put("Apple", 25);
		System.out.println("TreeMap after replacing 'Apple' value: " + fruits);

		// Clearing the TreeMap using clear() method
		fruits.clear();
		System.out.println("TreeMap after clearing: " + fruits);

		// Checking if the TreeMap is empty using isEmpty() method
		System.out.println("Is TreeMap empty? " + fruits.isEmpty());
	}
}
