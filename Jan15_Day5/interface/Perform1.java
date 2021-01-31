package practise;

public class Perform1 implements MyInterface {

	@Override
	public int performAction(int a, int b) {
		System.out.println("Perform addition");
		return a + b;
	}

}
