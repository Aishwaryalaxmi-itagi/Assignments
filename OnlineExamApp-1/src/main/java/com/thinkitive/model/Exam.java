package com.thinkitive.model;

import java.util.ArrayList;
import java.util.List;

public class Exam {
	private int examID;
	private String examName;
	List<Question> questions = new ArrayList<>();

	public Exam() {
		// TODO Auto-generated constructor stub
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String exanName) {
		this.examName = exanName;
	}

	public Exam(int examID, String examName, List<Question> questions) {
		super();
		this.examID = examID;
		this.examName = examName;
		this.questions = questions;
	}

	public int getExamID() {
		return examID;
	}

	public void setExamID(int examID) {
		this.examID = examID;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Exam [examID=" + examID + ", examName=" + examName + ", questions=" + questions + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + examID;
		return result;
	}
}
