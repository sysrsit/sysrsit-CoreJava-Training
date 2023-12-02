package com.sysrs.jobreadiness.corejava.strings;

import java.util.Scanner;

/**
 * StringBuffer is a mutable string class in Java that provides a thread-safe
 * way to modify strings.
 *
 */

public class StringBufferDemo {

	public static void main(String[] args) {
		// Creating a StringBuffer

		try (Scanner sc = new Scanner(System.in)) {
			String str1 = sc.next();
			String str2 = sc.next();
			StringBuffer stringBuffer = new StringBuffer(str1);
			StringBuffer stringBuffer2 = new StringBuffer(str2);

			// Appending text
			stringBuffer.append(" World");
			// StringBuffer
			System.out.println("StringBuffer: " + stringBuffer);

			// Inserting text at a specific position
			stringBuffer.insert(5, ", Java");
			System.out.println("StringBuffer after insertion: " + stringBuffer);

			// Deleting text
			stringBuffer.delete(5, 11);
			System.out.println("StringBuffer after deletion: " + stringBuffer);

			// compares two strings
			System.out.println(stringBuffer.equals(stringBuffer2));
		}
	}
}
