package com.sysrs.jobreadiness.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sysrs.jobreadiness.corejava.helperclass.StudentInfo;

/**
 * The Comparator interface defines a strategy for comparing objects of the same
 * type based on a customized ordering.
 *
 */
public class ComparatorDemo {
	public static void main(String[] args) {
		List<StudentInfo> studentList = new ArrayList<>();
		studentList.add(new StudentInfo("Alice", 20, 3.8));
		studentList.add(new StudentInfo("Bob", 22, 3.5));
		studentList.add(new StudentInfo("Charlie", 21, 3.9));
		studentList.add(new StudentInfo("David", 22, 3.7));
		studentList.add(new StudentInfo("Eve", 20, 3.6));

		System.out.println("Original list of students:");
		printStudentList(studentList);

		// Sorting based on age using basic comparator
		Comparator<StudentInfo> ageComparator = Comparator.comparingInt(StudentInfo::getAge);
		Collections.sort(studentList, ageComparator);
		System.out.println("\nSorted by age:");

		printStudentList(studentList);

		// Chained comparators for sorting by age and then by GPA
		Comparator<StudentInfo> ageAndGpaComparator = ageComparator.thenComparingDouble(StudentInfo::getGpa);
		Collections.sort(studentList, ageAndGpaComparator);
		System.out.println("\nSorted by age and then by GPA:");

		printStudentList(studentList);

//        // Using lambda expression for a custom comparator (sorting by name)
//        Comparator<StudentInfo> nameComparator = (s1, s2) -> s1.getName().compareTo(s2.getName());
//        Collections.sort(studentList, nameComparator);
//        System.out.println("\n Sorted by name (using lambda comparator):");
//        
//        printStudentList(studentList);

	}

	private static void printStudentList(List<StudentInfo> studentList) {
		for (StudentInfo student : studentList) {
			System.out.println(student);
		}
	}
}
