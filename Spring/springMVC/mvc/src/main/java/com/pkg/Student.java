package com.pkg;

public class Student {
	String studentId;
	String studentName;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Student(String studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	
	public Student() {
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " "+getStudentId()+": "+getStudentName();
	}
}
