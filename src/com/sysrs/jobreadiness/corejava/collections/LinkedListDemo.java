package com.sysrs.jobreadiness.corejava.collections;

import java.util.LinkedList;

/**
 * LinkedList is a dynamic data structure that stores elements in a linear
 * fashion, where each element is linked to the next using pointers.
 *
 */
public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> numbers = new LinkedList<Integer>();
		// Add elements to the LinkedList
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);

		System.out.println("LinkedList: " + numbers);
		// Add elements at specific positions
		numbers.add(1, 15); // Insert 15 at index 1
		numbers.addFirst(5); // Insert 5 at the beginning
		numbers.addLast(50); // Insert 50 at the end
		System.out.println("LinkedList after adding elements: " + numbers);
		// Get the first and last elements
		System.out.println("First element: " + numbers.getFirst());
		System.out.println("Last element: " + numbers.getLast());
		// Remove elements by value
		numbers.removeFirstOccurrence(15); // Remove the first occurrence of 15
		numbers.removeLastOccurrence(40); // Remove the last occurrence of 40

		System.out.println("LinkedList after removing elements: " + numbers);
		// Check if the LinkedList contains an element
		boolean contains30 = numbers.contains(30);
		System.out.println("Does the LinkedList contain 30? " + contains30);
		// Get the size of the LinkedList
		int size = numbers.size();
		System.out.println("Size of the LinkedList: " + size);
		// Iterate through the LinkedList and print its elements
		// System.out.println("Iterating through the LinkedList:"); for (int number :
		// numbers) {
		System.out.print(numbers + " ");
	}
}
