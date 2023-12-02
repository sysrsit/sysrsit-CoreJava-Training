package com.sysrs.jobreadiness.corejava.collections;

/**
 * Iterators are objects that enable traversing through a collection of elements in a sequential manner. 
 *
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class IteratorsDemo {

	public static void main(String[] args) {

		// Fail-Fast Iterator Example

		// Creating an ArrayList
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
		}

		// Creating an iterator over the ArrayList
		Iterator<Integer> failFastIterator = numbers.iterator();

		// Modifying the ArrayList while iterating (Fail-Fast behavior)
		System.out.println("Fail-Fast Iterator:");
		while (failFastIterator.hasNext()) {
			int number = failFastIterator.next();
			System.out.print(number + " ");

			if (number == 5) {
				numbers.remove(number);
			}
		}

		// Fail-Safe Iterator Example

		// Creating a ConcurrentHashMap
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		// Creating an iterator over the ConcurrentHashMap
		Iterator<String> failSafeIterator = map.keySet().iterator();

		// Modifying the ConcurrentHashMap while iterating (Fail-Safe behavior)
		System.out.println("\n\nFail-Safe Iterator:");
		while (failSafeIterator.hasNext()) {
			String key = failSafeIterator.next();
			System.out.print(key + " ");

			if (key.equals("B")) {
				map.put("D", 4);
			}
		}
	}
}
