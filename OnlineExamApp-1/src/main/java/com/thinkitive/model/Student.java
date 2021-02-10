package com.thinkitive.model;

public class Student {
	private int studentId;
	private String studentUsername;
	private String studentPassword;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentUsername, String studentPassword) {
		super();
		this.studentId = studentId;
		this.studentUsername = studentUsername;
		this.studentPassword = studentPassword;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentUsername() {
		return studentUsername;
	}

	public void setStudentUsername(String studentUsername) {
		this.studentUsername = studentUsername;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	@Override
	public String toString() {
		return " [studentId=" + studentId + ", studentUsername=" + studentUsername + ", studentPassword="
				+ studentPassword + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentId != other.studentId)
			return false;
		return true;
	}

}
