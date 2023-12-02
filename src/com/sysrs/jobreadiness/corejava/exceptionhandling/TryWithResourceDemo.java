package com.sysrs.jobreadiness.corejava.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * try-with-resources statement eliminates the need for an explicit finally
 * block to explicitly close the resources.
 *
 */
public class TryWithResourceDemo {

	public static void main(String[] args) {
		// Provide the path to a non-existing file to demonstrate FileNotFoundException
		String filePath = "nonexistentfile.txt";

		// Using try-with-resources to automatically close resources
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			handleIOException(e);
		}
	}

	private static void handleIOException(IOException e) {
		System.err.println("IOException: " + e.getMessage());
		System.err.println("StackTrace: ");
		e.printStackTrace();
		// Additional handling logic can be added based on specific requirements
	}
}
