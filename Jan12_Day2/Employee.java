
public class Employee {
	static int empid = 0;
	String ename;
	double basicSalary, PT, medical, HRA, PF, grossSalary, netsalary;
	static String cname = "Thinkitive Tech";

	static int count = 100;

	public Employee() {
		count++;
		this.empid = count;
		System.out.println(count+"  "+empid);
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
		System.out.println("***EMPLOYEE DETAILS***");
		System.out.println("Emp ID: " + empid);
		System.out.println("Emp Name: " + ename);
		System.out.println("basic Salary: " + basicSalary);
		System.out.println("PT: " + PT);
		System.out.println("Medical: " + medical);
		System.out.println("GROSS SALARY :" + GrossSalary());
		System.out.println("NET SALARY: " + NetSalary());

	}
}
