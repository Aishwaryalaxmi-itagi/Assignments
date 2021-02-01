package com.thinkitive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private int empid;
	private String ename;
	transient private double salary;
	Address address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String ename, double salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}

	public Employee(int empid, String ename, double salary, Address address) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.address = address;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
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

	public void doSeralize() {

		try {
			FileOutputStream fos = new FileOutputStream("demo.serial");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(this);

			oos.close();

			fos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Employee deDeserialize() {
		Employee e = null;
		try {
			FileInputStream fio = new FileInputStream("demo.serial");

			ObjectInputStream ois = new ObjectInputStream(fio);

			e = (Employee) ois.readObject();

			ois.close();

			fio.close();

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return e;

	}
}
