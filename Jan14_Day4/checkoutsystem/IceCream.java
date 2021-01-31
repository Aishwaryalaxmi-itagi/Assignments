package checkoutsystem;

public class IceCream extends DesertItem {

	double costInRs;

	public IceCream() {
		// TODO Auto-generated constructor stub
	}

	public IceCream(String name, double costInRs) {
		super(name);
		this.costInRs = costInRs;
	}

	/**
	 * 
	 */
	@Override
	public double returnCost() {

		return costInRs;
	}
}
