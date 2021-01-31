package com.thinkitive.db;

public class Employee {
	private int empid;
	private String ename;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String ename, double salary) {
		
		this.empid = empid;
		this.ename = ename;
		
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public int getEmpid() {
		return empid;
	}

	public String getEname() {
		return ename;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
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
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		return true;
	}
	
	
	
}
