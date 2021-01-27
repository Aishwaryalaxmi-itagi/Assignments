package checkoutsystem;

public class Cookie extends DesertItem {
	int noOfCookies;
	double cookiePrice;

	public Cookie() {
		// TODO Auto-generated constructor stub
	}

	public Cookie(String name, int noOfCookies) {
		super(name);
		this.noOfCookies = noOfCookies;
		this.cookiePrice = 10;

	}

	@Override
	public double returnCost() {

		return (noOfCookies) * cookiePrice;
	}
}
