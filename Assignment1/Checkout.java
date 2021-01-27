package checkoutsystem;

public class Checkout {

	DesertItem cashRegister[];

	public Checkout() {
		// TODO Auto-generated constructor stub
	}

	public void addDesertItems(DesertItem items[]) {
		this.cashRegister = items;

	}

	public void clearCashRegister() {

		if (cashRegister != null) {
			cashRegister = null;
		} else {
			System.err.println("cart is empty!!!");
		}

	}

	public int getNoOfItems() {
		if (cashRegister != null) {
			return cashRegister.length;
		}

		else {
			System.err.println("cart is empty!!!");
			return 0;
		}

	}

	public double getTotalCost() {
		double getTCost = 0;
		if (cashRegister != null) {
			for (DesertItem i : cashRegister) {
				getTCost = getTCost + i.returnCost();
			}
			return getTCost;
		}

		else {
			System.err.println("Cart Is empty!!!");
			return 0;
		}

	}

	@Override
	public String toString() {
		String S = "";
		if (cashRegister != null) {
			for (DesertItem i : cashRegister) {
				S = S + i.getName() + "\n";
			}

			S = S + "TOTAL: " + this.getTotalCost();
			return S;
		}

		else {
			System.err.println("Cart Is empty!!!");
			return S;
		}

	}

}
