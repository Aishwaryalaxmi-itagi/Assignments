package com.thinkitive.model;

public class Result {

	private int ansqueNo;
	private String answer;

	public Result() {
		// TODO Auto-generated constructor stub
	}

	public Result(int ansqueNo, String answer) {
		super();
		this.ansqueNo = ansqueNo;
		this.answer = answer;
	}

	public int getansqueNo() {
		return ansqueNo;
	}

	public void setansqueNo(int ansqueNo) {
		this.ansqueNo = ansqueNo;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return " [queNo=" + ansqueNo + ", answer=" + answer + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ansqueNo;
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
		Result other = (Result) obj;
		if (ansqueNo != other.ansqueNo)
			return false;
		return true;
	}

}
