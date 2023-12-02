package com.sysrs.jobreadiness.corejava.collections;

import com.sysrs.jobreadiness.corejava.helperclass.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Comparable interface defines a strategy for comparing objects of the same
 * type based on their natural ordering.
 *
 */
public class ComparableDemo {
	public static void main(String[] args) {
		// Create a list of ExampleObjects
		List<StudentInfo> studentList = new ArrayList<>();
		studentList.add(new StudentInfo("Sai", 22, 3.8));
		studentList.add(new StudentInfo("Shiv", 24, 4.0));
		studentList.add(new StudentInfo("Divija", 17, 2.8));

		// Print the list before sorting
		System.out.println("Before sorting:");
		for (StudentInfo obj : studentList) {
			System.out.println(obj);
		}

		// Sort the list using the natural order defined by Comparable
		Collections.sort(studentList);

		// Print the list after sorting
		System.out.println("\nAfter natural sorting by ID:");
		for (StudentInfo obj : studentList) {
			System.out.println(obj);
		}
	}

}
