
public class Manager extends Employee {
	double foodAllowance, managerAllowance, otherAllowance;

	public Manager(String ename, double basicSalary, double medical) {
		super(ename, basicSalary, medical);
		this.foodAllowance = 0.08 * super.basicSalary;
		this.managerAllowance = 0.1 * super.basicSalary;
		this.otherAllowance = 0.03 * super.basicSalary;
	}

	@Override
	public double GrossSalary() {
		this.grossSalary = super.GrossSalary() + this.foodAllowance + this.managerAllowance + this.otherAllowance;
		return this.grossSalary;
	}

}
