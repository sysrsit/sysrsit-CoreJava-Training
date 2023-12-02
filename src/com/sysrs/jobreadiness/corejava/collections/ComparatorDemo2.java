package com.sysrs.jobreadiness.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sysrs.jobreadiness.corejava.helperclass.StudentInfo;
/**
 * Comparator is an interface used to specify logic for sorting
 *
 */

public class ComparatorDemo2 {
	public static void main(String[] args) {
		Comparator<Integer> com = new Comparator<Integer>() {

			// sorting based on last index value
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 % 10 > o2 % 10)
					return 1;
				else
					return -1;
			}
		};

		new Comparator<StudentInfo>() {

			// sorting based age
			@Override
			public int compare(StudentInfo o1, StudentInfo o2) {
				if (o1.getAge() > o2.getAge())
					return 1;
				else
					return -1;
			}
		};
		
		List<Integer> lst = new ArrayList<>();
		lst.add(12);
		lst.add(23);
		lst.add(46);
		lst.add(87);
		lst.add(70);
		lst.add(200);

		Collections.sort(lst, com);

		System.out.println("After Sorting\n" + lst);

		// List of student objects
		List<StudentInfo> studentInfo = new ArrayList<>();
		studentInfo.add(new StudentInfo("Ram", 40, 3.8));
		studentInfo.add(new StudentInfo("Jhansi", 32, 3.2));
		studentInfo.add(new StudentInfo("Kishan", 30, 2.5));

		Collections.sort(studentInfo);

		System.out.println(studentInfo);
	}
}
