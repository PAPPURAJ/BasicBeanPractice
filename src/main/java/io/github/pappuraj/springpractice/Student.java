package io.github.pappuraj.springpractice;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	
	
	public Student() {
		super();
		//System.out.println("Default constructor calling!");
	}
	
	
	
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		//System.out.println("Parameterized constructor calling!");
	}



	public int getStudentId() {
		//System.out.println("GetStudentID calling!");
		return studentId;
	}
	public void setStudentId(int studentId) {
		//System.out.println("SetStudentID calling!");
		this.studentId = studentId;
	}
	public String getStudentName() {
		//System.out.println("GetStudentName calling!");
		return studentName;
	}
	public void setStudentName(String studentName) {
		//System.out.println("SetStudentName calling!");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		//System.out.println("GetStudentAddress calling!");
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		//System.out.println("SetStudentAddress calling!");
		this.studentAddress = studentAddress;
	}



	@Override
	public String toString() {
		//System.out.println("To string calling!");
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
	

}
