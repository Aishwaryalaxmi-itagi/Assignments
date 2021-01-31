/**
 * 1. Implementation of inheritance 2. Method Overriding 3. super keyword
 * 
 * @author thinkitive
 *
 */
public class AdvancedCalculator extends Calculator {

	public AdvancedCalculator() {
		System.out.println("Advanced calculator");
	}

	public int factorial(int num) {
		int value = 1;
		for (int i = num; i > 0; i--) {
			value = value * i;
		}
		return value;
	}

	@Override
	public int div(int a, int b) {
		System.out.println("Quotient: " + super.div(a, b));
		return a % b;
	}

	@Override
	public AdvancedCalculator demo() {
		return null;
	}
}
