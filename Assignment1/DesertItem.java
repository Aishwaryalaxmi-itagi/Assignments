package checkoutsystem;

public abstract class DesertItem {
	String name;

	public DesertItem() {
		// TODO Auto-generated constructor stub
	}

	public DesertItem(String name) {
		this.name = name;
	}

	public abstract double returnCost();

	final String getName() {
		return this.name;
	}

}
