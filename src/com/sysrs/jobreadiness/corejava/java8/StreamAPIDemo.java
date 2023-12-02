package com.sysrs.jobreadiness.corejava.java8;

import java.util.*;
import java.util.stream.*;

/**
 * StreamAPI allows to chain together a series of operations on a stream, such
 * as filtering, mapping, and reducing, without explicitly creating intermediate
 * collections.
 *
 */
public class StreamAPIDemo {

	public static void main(String[] args) {
		// Step 1: Creating a stream

		// Stream from a collection
		List<String> stringList = Arrays.asList("apple", "banana", "orange", "kiwi", "grape");
		Stream<String> stringStream = stringList.stream();
		System.out.println("Stream from a Collection: " + stringStream);

		// Stream from an array
		String[] stringArray = { "cat", "dog", "elephant", "lion", "tiger" };
		Stream<String> stringArrayStream = Arrays.stream(stringArray);
		System.out.println("Stream from an array: " + stringArrayStream);

		// Stream of values
		Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
		System.out.println("Stream of values: " + intStream);

		// Stream from a range
		IntStream rangeStream = IntStream.range(1, 6);
		System.out.println("Stream from a range: " + rangeStream);

		// Stream from a collection with parallel processing
		Stream<String> parallelStream = stringList.parallelStream();
		System.out.println("Stream from a collection: " + parallelStream);

		// Step 2: Intermediate operations

		// Filter: Keep only elements that start with 'a'
		List<String> filteredList = stringList.stream()
				.filter(s -> s.startsWith("a"))
				.collect(Collectors.toList());
		System.out.println("Filtered List: " + filteredList);

		// Map: Convert each element to uppercase
		List<String> uppercasedList = stringList.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println("Uppercased List: " + uppercasedList);

		// FlatMap: Flatten a stream of lists
		List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9));
		List<Integer> flattenedList = nestedList.stream()
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
		System.out.println("Flattened List: " + flattenedList);

		// Sorted: Sort elements in natural order
		List<String> sortedList = stringList.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println("Sorted List: " + sortedList);

		// Peek: Perform an action on each element without modifying the stream
		List<String> peekedList = stringList.stream()
				.peek(s -> System.out.println("Peeked: " + s))
				.collect(Collectors.toList());
		System.out.println("Peeked List: " + peekedList);

		// Distinct: Remove duplicate elements
		List<Integer> duplicateList = Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5);
		List<Integer> distinctList = duplicateList.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("Distinct List: " + distinctList);

		// Step 3: Terminal operations

		// forEach: Iterate over elements
		stringList.forEach(System.out::println);

		// toArray: Convert stream to an array
		String[] stringArrayFromStream = stringList.stream().toArray(String[]::new);
		System.out.println("Array from Stream: " + Arrays.toString(stringArrayFromStream));

		// collect: Convert stream to a collection
		Set<String> stringSet = stringList.stream().collect(Collectors.toSet());
		System.out.println("Set from Stream: " + stringSet);

		// count: Count the number of elements in the stream
		long count = stringList.stream().count();
		System.out.println("Number of elements: " + count);

		// reduce: Perform a reduction on the elements of the stream
		Optional<String> concatenatedString = stringList.stream().reduce((s1, s2) -> s1 + ", " + s2);
		concatenatedString.ifPresent(s -> System.out.println("Concatenated String: " + s));

		// anyMatch, allMatch, noneMatch: Check if any, all, or none of the elements
		// match a given condition
		boolean anyMatchResult = stringList.stream().anyMatch(s -> s.contains("a"));
		boolean allMatchResult = stringList.stream().allMatch(s -> s.length() > 1);
		boolean noneMatchResult = stringList.stream().noneMatch(s -> s.endsWith("x"));
		System.out.println("Any match: " + anyMatchResult);
		System.out.println("All match: " + allMatchResult);
		System.out.println("None match: " + noneMatchResult);

		// findFirst, findAny: Find the first or any element in the stream
		Optional<String> firstElement = stringList.stream().findFirst();
		Optional<String> anyElement = stringList.stream().findAny();
		firstElement.ifPresent(s -> System.out.println("First Element: " + s));
		anyElement.ifPresent(s -> System.out.println("Any Element: " + s));

		// min, max: Find the minimum or maximum element in the stream
		Optional<String> minLengthString = stringList.stream().min(Comparator.comparing(String::length));
		Optional<String> maxLengthString = stringList.stream().max(Comparator.comparing(String::length));
		minLengthString.ifPresent(s -> System.out.println("Shortest String: " + s));
		maxLengthString.ifPresent(s -> System.out.println("Longest String: " + s));

		// Step 4: Parallel Streams

		// Sequential stream
		long sequentialTime = measureTime(() -> stringList.stream().forEach(s -> {
		}));
		System.out.println("Sequential Time: " + sequentialTime + " ms");

		// Parallel stream
		long parallelTime = measureTime(() -> stringList.parallelStream().forEach(s -> {
		}));
		System.out.println("Parallel Time: " + parallelTime + " ms");
	}

	// Helper method to measure the time of execution
	private static long measureTime(Runnable action) {
		long startTime = System.currentTimeMillis();
		action.run();
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
}
