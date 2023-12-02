package com.sysrs.jobreadiness.corejava.strings;

/**
 * A String is an immutable sequence of characters.
 *
 */
public class StringDemo {

	public static void main(String[] args) {
		// Creating strings
		String str1 = "Hello,";
		String str2 = " World!";
		String str3 = new String("Java");

		// Concatenation
		String result = str1 + str2 + str3;
		System.out.println("Concatenated String: " + result);

		// Length of a string
		System.out.println("Length of String: " + result.length());

		// Character at a specific index
		System.out.println("Character at Index 7: " + result.charAt(7));

		// Substring
		System.out.println("Substring (0-4): " + result.substring(0, 5));

		// Uppercase and lowercase
		System.out.println("Uppercase: " + result.toUpperCase());
		System.out.println("Lowercase: " + result.toLowerCase());

		// Replace characters
		System.out.println("String with 'o' replaced by '0': " + result.replace('o', '0'));

		// Trimming whitespace
		String withWhitespace = "    Trim Me    ";
		System.out.println("Original String: '" + withWhitespace + "'");
		System.out.println("Trimmed String: '" + withWhitespace.trim() + "'");
	}
}
