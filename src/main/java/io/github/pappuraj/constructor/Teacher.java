package io.github.pappuraj.constructor;


public class Teacher {
	private String name;
	private String des;
	private Student student;
	public Teacher() {
		super();
	}
	public Teacher(String name, String des, Student student) {
		super();
		this.name = name;
		this.des = des;
		this.student = student;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", des=" + des + ", student=" + student + "]";
	}

}
