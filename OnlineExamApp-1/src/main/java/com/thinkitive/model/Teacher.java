package com.thinkitive.model;

public class Teacher {
	private int teacherId;
	private String teacherUsername;
	private String teacherPassword;

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(int teacherId, String teacherUsername, String teacherPassword) {
		super();
		this.teacherId = teacherId;
		this.teacherUsername = teacherUsername;
		this.teacherPassword = teacherPassword;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherUsername() {
		return teacherUsername;
	}

	public void setTeacherUsername(String teacherUsername) {
		this.teacherUsername = teacherUsername;
	}

	public String getTeacherPassword() {
		return teacherPassword;
	}

	public void setTeacherPassword(String teacherPassword) {
		this.teacherPassword = teacherPassword;
	}

	@Override
	public String toString() {
		return " [teacherId=" + teacherId + ", teacherUsername=" + teacherUsername + ", teacherPassword="
				+ teacherPassword + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + teacherId;
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
		Teacher other = (Teacher) obj;
		if (teacherId != other.teacherId)
			return false;
		return true;
	}

}
