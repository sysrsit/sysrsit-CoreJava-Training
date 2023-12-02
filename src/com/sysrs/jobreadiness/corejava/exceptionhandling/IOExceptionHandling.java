package com.sysrs.jobreadiness.corejava.exceptionhandling;

import java.io.*;

/**
 * IOException indicates an input/output operation has failed or been
 * interrupted, typically arising when dealing with file operations, network
 * connections, or other input/output-related tasks.
 *
 */
public class IOExceptionHandling {

	public static void main(String[] args) {
		try {
			// getting the test.txt file
			File file = new File("test.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line;
			// iterating through the file until it reaches end of the file
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			bufferedReader.close();
			fileReader.close();
		} catch (IOException e) {
			if (e instanceof FileNotFoundException) {
				System.out.println("File not found: " + e.getMessage());
			} else if (e instanceof IOException) {
				System.out.println("Error reading file: " + e.getMessage());
			} else {
				System.out.println("Unhandled IOException: " + e.getMessage());
			}
		}
	}
}
