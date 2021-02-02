package employee.assignment;

public class Employee {

	private int empid;
	private String ename;
	private double basicSalary, pf, pt, hra, medical, grossSalary, netSalary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String ename, double basicSalary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.basicSalary = basicSalary;
		this.pf = 0.12 * this.basicSalary;
		this.hra = 0.5 * this.basicSalary;
		this.grossSalary=GrossSalary();
		this.netSalary=NetSalary();

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

	public double getBasicSalary() {
		return basicSalary;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double GrossSalary() {
		double GS = 0;
		GS = basicSalary + hra + medical;
		return GS;
	}

	public double NetSalary() {
		double NS = GrossSalary() - pf - pt;
		return NS;
	}

	public void Printdetails() {
		System.out.println("EMP ID: " + empid);
		System.out.println("EMP NAME: " + ename);
		System.out.println("BASIC SALARY: " + basicSalary);
		System.out.println("PT: " + pt);
		System.out.println("MEDICAL: " + medical);
		System.out.println("GROSS SALARY :" + GrossSalary());
		System.out.println("NET SALARY: " + NetSalary());
		System.out.println();

	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", basicSalary=" + basicSalary + ", pf=" + pf + ", pt="
				+ pt + ", hra=" + hra + ", medical=" + medical + ", grossSalary=" + grossSalary + ", netSalary="
				+ netSalary + "]";
	}

}
