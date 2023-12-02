package com.sysrs.jobreadiness.corejava.strings;

public class ImmutableDemo {
	public static void main(String[] args) {
		// Original string
		String originalString = "Hello, World!";

		// Concatenation creates a new string
		String concatenatedString = originalString.concat(" How are you?");
		System.out.println("Original String: " + originalString);
		System.out.println("Concatenated String: " + concatenatedString);
		// String literals are automatically interned
		String str1 = "Java";
		String str2 = "Java";
		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str1.equals str2: " + (str1.equals(str2)));

		String string1 = "Java";
		String string2 = new String("Java");
		System.out.println("Hash code of String 1 " + string1.hashCode());
		System.out.println("Hash code of String 1 " + string2.hashCode());
		// '==' compares the addresses for objects
		System.out.println("str1 == str2: " + (string1 == string2));
		// '==' compare strings character by character
		System.out.println("str1.equals str2: " + (string1.equals(string2)));
	}
}
