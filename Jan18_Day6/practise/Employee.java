package Practise;

public class Employee implements Comparable<Employee> {
	int empid;
	String ename;
	double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	Employee(int empid, String ename, double salary) {
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {

		return "[ EMPID: " + this.empid + ", EMP name: " + this.ename + ", EMP SALARY: " + this.salary + "]\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
	public int compareTo(Employee e) {
		if (this.salary > e.salary)
			return 1;
		else if (this.salary < e.salary)
			return -1;
		else
			return 0;
	}
}
