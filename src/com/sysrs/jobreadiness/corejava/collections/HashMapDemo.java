package com.sysrs.jobreadiness.corejava.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap is an unordered collection of key-value pairs that efficiently stores
 * and retrieves data based on unique keys.
 *
 */
public class HashMapDemo {

	public static void main(String[] args) {

		// Creating a HashMap using default constructor
		HashMap<String, Integer> technologies = new HashMap<>();

		// Adding elements to the HashMap using put() method
		technologies.put("Apple", 10);
		technologies.put("Orange", 15);
		technologies.put("Banana", 20);

		// Using Java 9+ Map.ofEntries factory method
		Map<String, Integer> mapOfEntries = Map.ofEntries(Map.entry("X", 10), Map.entry("Y", 20), Map.entry("Z", 30));

		System.out.println("Map of Entries: " + mapOfEntries);
		// Checking if a key exists using containsKey() method
		System.out.println("Does HashMap contain 'Apple' key? " + technologies.containsKey("Apple"));

		// Getting the value of a key using get() method
		System.out.println("Value associated with 'Orange' key: " + technologies.get("Orange"));

		// Removing a key-value pair using remove() method
		technologies.remove("Banana");
		System.out.println("HashMap after removing 'Banana' key: " + technologies);

		// Checking the size of the HashMap using size() method
		System.out.println("Size of HashMap: " + technologies.size());

		// Iterating over the HashMap using keySet() and get() methods
		System.out.println("HashMap contents:");
		for (String key : technologies.keySet()) {
			System.out.println("Key: " + key + ", Value: " + technologies.get(key));
		}

		// Checking if a value exists using containsValue() method
		System.out.println("Does HashMap contain value 15? " + technologies.containsValue(15));

		// Replacing a value for a key using put() method
		technologies.put("Apple", 25);
		System.out.println("HashMap after replacing 'Apple' value: " + technologies);

		// Clearing the HashMap using clear() method
		technologies.clear();
		System.out.println("HashMap after clearing: " + technologies);

		// Checking if the HashMap is empty using isEmpty() method
		System.out.println("Is HashMap empty? " + technologies.isEmpty());
	}
}
