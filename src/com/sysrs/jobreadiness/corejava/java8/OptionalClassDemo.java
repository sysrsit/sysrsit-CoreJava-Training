package com.sysrs.jobreadiness.corejava.java8;

import java.util.Optional;

import com.sysrs.jobreadiness.corejava.helperclass.User;

/**
 * The Optional class is a container object that can hold a value, including "no
 * value".
 *
 */
public class OptionalClassDemo {

	public static void main(String[] args) {
		// Creating Optional instances
		Optional<String> emptyOptional = Optional.empty();
		Optional<String> nonEmptyOptional = Optional.of("Hello, Optional!");

		// Creating Optional from nullable values
		String nullableValue = "Nullable Value";
		Optional<String> optionalFromNullable = Optional.ofNullable(nullableValue);
		System.out.println("Optional from nullable values: " + optionalFromNullable);

		// Using isPresent() to check if a value is present
		if (nonEmptyOptional.isPresent()) {
			System.out.println("Value is present: " + nonEmptyOptional.get());
		} else {
			System.out.println("Value is not present");
		}

		// Conditional execution with ifPresent()
		nonEmptyOptional.ifPresent(value -> System.out.println("Value present: " + value));

		// Default value with orElse()
		String result = emptyOptional.orElse("Default Value");
		System.out.println("Result with orElse(): " + result);

		// Default value with orElseGet() (using a Supplier)
		String resultFromSupplier = emptyOptional.orElseGet(() -> "Default Value from Supplier");
		System.out.println("Result with orElseGet(): " + resultFromSupplier);

		// Throwing an exception with orElseThrow()
		try {
			emptyOptional.orElseThrow(() -> new IllegalArgumentException("Value not present"));
		} catch (IllegalArgumentException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}

		// Mapping values with map()
		Optional<String> mappedOptional = nonEmptyOptional.map(value -> value.toUpperCase());
		System.out.println("Mapped value: " + mappedOptional.orElse("No value"));

		// Filtering values with filter()
		Optional<String> filteredOptional = nonEmptyOptional.filter(value -> value.length() > 10);
		System.out.println("Filtered value: " + filteredOptional.orElse("No value"));

		// Chaining multiple operations
		String resultOfChainedOperations = nonEmptyOptional.map(value -> value + " - Modified")
				.filter(value -> value.length() > 20).orElse("No value after chaining operations");
		System.out.println("Result of chained operations: " + resultOfChainedOperations);

		// Using Optional with custom objects
		User user = new User("John Doe", 30);
		Optional<User> userOptional = Optional.of(user);

		// Mapping and chaining operations with custom objects
		String userName = userOptional.map(User::getName).orElse("Unknown");
		System.out.println("User Name: " + userName);

		int userAge = userOptional.filter(u -> u.getAge() > 25).map(User::getAge).orElse(-1);
		System.out.println("User Age: " + userAge);
	}
}
