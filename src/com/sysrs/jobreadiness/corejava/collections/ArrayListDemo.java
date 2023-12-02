package com.sysrs.jobreadiness.corejava.collections;

/**
 * An ArrayList in Java is a resizable(dynamic) array.
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Creating an empty ArrayList using the ArrayList constructor
		ArrayList<String> sysrs = new ArrayList<>();

		// Adding elements to the ArrayList
		sysrs.add("Development ");
		sysrs.add("DevOps");
		sysrs.add("Data Analysis");
		sysrs.add("Software Engineer");

		// Creating an ArrayList and initializing it with elements
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));

		// Using Java 9+ Collection Factory Methods
		List<String> immutableList = List.of("Java", "Python", "C++");
		ArrayList<String> list3 = new ArrayList<>(immutableList);

		// Using double brace initialization (less recommended)
		ArrayList<String> list4 = new ArrayList<>() {
			private static final long serialVersionUID = 1L;
			{
				add("One");
				add("Two");
				add("Three");
			}
		};

		// Displaying elements of each ArrayList
		System.out.println("List 1: " + sysrs);
		System.out.println("List 2: " + list2);
		System.out.println("List 3: " + list3);
		System.out.println("List 4: " + list4);

		// Accessing elements by index
		System.out.println("Element at index 1 in List 1: " + sysrs.get(1));

		// Updating an element
		sysrs.set(2, "Data Science");
		System.out.println("List after updating: " + sysrs);

		// Removing an element
		list3.remove("Java");
		System.out.println("List 3 after removing 'Java': " + list3);

		// Checking if an element exists
		System.out.println("Does List 4 contain 'Two'? " + list4.contains("Two"));

		// Getting the size of the ArrayList
		System.out.println("Size of List 1: " + sysrs.size());

		// Clearing the ArrayList
		list2.clear();
		System.out.println("List 2 after clearing: " + list2);
	}
}
