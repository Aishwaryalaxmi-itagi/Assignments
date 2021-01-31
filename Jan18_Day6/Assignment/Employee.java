package CaseStudy;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	private int empid;
	private String ename;
	private double salary;

	private Address address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	Employee(int empid, String ename, double salary, Address address) {
		
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.address = address;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public String getEname() {
		return ename;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "[ EMPID: " + this.empid + ", EMP name: " + this.ename + ", EMP SALARY: " + this.salary
				+ "ADDRESS CITY: " + address.getCity() + "ADDRESS PINCODE: " + address.getPincode() + "]\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + empid;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (empid != other.empid)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	@Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
