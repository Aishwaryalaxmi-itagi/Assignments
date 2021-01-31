
public class Employee {
	int empid;
	String ename;
	double basicSalary, PT, medical, HRA, PF, grossSalary, netsalary;
	static String cname = "Thinkitive Tech";

	static int count = 101;

	public Employee() {
		this.empid = count;
		count++;
	}

	public Employee(String ename, double basicSalary) {
		this();
		this.ename = ename;
		this.basicSalary = basicSalary;
	}

	public Employee(String ename, double basicSalary, double medical) {
		this(ename, basicSalary);
		this.PT = 200;
		this.medical = medical;
		this.HRA = (0.5 * basicSalary);
		this.PF = (0.12 * basicSalary);
	}

	public double GrossSalary() {
		double GS = 0;
		GS = basicSalary + HRA + medical;
		return GS;
	}

	public double NetSalary() {
		double NS = GrossSalary() - PF - PT;
		return NS;
	}

	public void Printdetails() {
		System.out.println("EMP ID: " + empid);
		System.out.println("EMP NAME: " + ename);
		System.out.println("BASIC SALARY: " + basicSalary);
		System.out.println("PT: " + PT);
		System.out.println("MEDICAL: " + medical);
		System.out.println("GROSS SALARY :" + GrossSalary());
		System.out.println("NET SALARY: " + NetSalary());
		System.out.println();

	}

}
