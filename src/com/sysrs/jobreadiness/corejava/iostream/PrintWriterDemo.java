package com.sysrs.jobreadiness.corejava.iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * @author 
 *
 */
public class PrintWriterDemo {
	public static void main(String[] args) {
		try (PrintWriter writer = new PrintWriter(new FileWriter("output.txt"))) {

			writer.println("Hello,");
			writer.println("Character Streams!");
			System.out.println("Text written successfully!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
