
public class MarketingExecutive extends Employee {
	double tourAllowance;
	double phoneAllowance;
	int kmstravelled;

	public MarketingExecutive() {

	}

	public MarketingExecutive(String ename, double basicSalary, double medical, int kmstravelled) {
		super(ename, basicSalary, medical);
		this.tourAllowance = 5 * kmstravelled;
		this.phoneAllowance = 1500;
	}

	@Override
	public double GrossSalary() {
		this.grossSalary = super.GrossSalary() + this.tourAllowance + this.phoneAllowance;
		return this.grossSalary;
	}
}
