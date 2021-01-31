package checkoutsystem;

public class Sundae extends IceCream {

	double costSundae;

	public Sundae() {
		// TODO Auto-generated constructor stub
	}

	public Sundae(double costInRs, double costToppings) {

		this.costInRs = costInRs + costToppings;
	}

	@Override
	public double returnCost() {
		// TODO Auto-generated method stub
		return costInRs;
	}

}
