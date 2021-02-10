package com.thinkitive.model;

import java.util.List;

public class Answer {
	private int examId;
	private int studentid;
	private List<Result> reslist;
	
	public Answer() {
		// TODO Auto-generated constructor stub
	}

	public Answer(int examId, int studentid, List<Result> reslist) {
		super();
		this.examId = examId;
		this.studentid = studentid;
		this.reslist = reslist;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public List<Result> getReslist() {
		return reslist;
	}

	public void setReslist(List<Result> reslist) {
		this.reslist = reslist;
	}

	@Override
	public String toString() {
		return "Answer [examId=" + examId + ", studentid=" + studentid + ", reslist=" + reslist + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + examId;
		result = prime * result + studentid;
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
		Answer other = (Answer) obj;
		if (examId != other.examId)
			return false;
		if (studentid != other.studentid)
			return false;
		return true;
	}

}
