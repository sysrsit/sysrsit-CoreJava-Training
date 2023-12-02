package com.sysrs.jobreadiness.corejava.exceptionhandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * throws keyword is used to declare in a method's signature that the method
 * might throw one or more specific types of exceptions during its execution.
 *
 */
public class ThrowsDemo {

	public static void writeToFile() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("hello.txt"));
		bw.write("Test");
		bw.close();
	}

	public static void main(String[] args) {
		System.out.println("hii");
		try {
			writeToFile();
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
	}

}
