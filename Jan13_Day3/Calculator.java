/**
 * 
 * @author thinkitive
 *
 */
public class Calculator {
	/**
	 * This method adds 2 integer numbers and produce the integr output
	 * 
	 * @param a first integer input
	 * @param b second integer input
	 * @return answer in integer format by adding a and b
	 */

	public Calculator() {
		System.out.println("Calculator");
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;

	}

	public int div(int a, int b) {
		return a / b;

	}

// OBJECT AS A RETURN TYPE (VARIANT OF OBJECTS)
	public AdvancedCalculator demo() {
		return null;
	}

	public int mul(int a, int b) {
		return a * b;
	}
}
