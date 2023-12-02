package com.sysrs.jobreadiness.corejava.helperclass;
/**
 * Sample Class 
 *
 */
public class StudentInfo implements Comparable<StudentInfo>{
	private String name;
	private int age;
	private double gpa;

	public StudentInfo(String name, int age, double gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getGpa() {
		return gpa;
	}

	@Override
	public String toString() {
		return "Student{name='" + name + "', age=" + age + ", gpa=" + gpa + '}';
	}

	@Override
	public int compareTo(StudentInfo stu) {
		return Double.compare(this.gpa, stu.gpa);
	}
}
