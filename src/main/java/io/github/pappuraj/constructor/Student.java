package io.github.pappuraj.constructor;

public class Student {
	private String name;
	private int roll;
	public Student() {
		super();
	}
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
	
	
}
