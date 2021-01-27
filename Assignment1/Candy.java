package checkoutsystem;

public class Candy extends DesertItem {

	double candyWeight;
	double candyPrice;

	public Candy() {
		// TODO Auto-generated constructor stub
	}

	public Candy(String name,double candyWeight) {
		super(name);
		this.candyWeight = candyWeight;
		this.candyPrice = 50;

	}

	@Override
	public double returnCost() {

		return (candyWeight * 0.001) * candyPrice;
	}

}
