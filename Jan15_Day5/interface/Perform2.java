package practise;

public class Perform2 implements MyInterface {

	@Override
	public int performAction(int a, int b) {
		System.out.println("perform substraction");
		return a - b;
	}

}
