package com.sysrs.jobreadiness.corejava.helperclass;

//Generic Class
public class Box<T> {
	private T value;

	public Box(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
