
public class Calculator {

	// METHOD OVERLOADING
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public float add(int a, float c) {
		return a + c;
	}

	public float add(float a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public double add(double... a)// VARARGS
	{
		double ans = 0;
		for (double i : a) {
			ans += i;
		}
		return ans;
	}

	public double sub(double... b) {
		double ans = 0;
		for (double i : b) {
			ans = i-ans;
		}
		ans*=-1;
		return ans;
	}

	public double div(double... a) {
		double ans = a[0];
		
		for (int i=1; i<a.length;i++) {
			ans /= a[i];
		}
		return ans;
	}

	public double mul(double...a) {
		double ans = 1;
		for (double i : a) {
			ans *= i;
		}
		return ans;
	}

	public int mod(int a, int b) {
		return a % b;
	}

	public int fact(int a) {
		int f = 1, i = 1;
		while (i <= a) {
			f *= i;
			i++;
		}

		return f;

	}
}
