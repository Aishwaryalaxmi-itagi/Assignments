package practise;

public class Outer {
	int o = 9;

	static class Inner {
		int i = 10;

		void demo() {
			System.out.println("Inner demo");
			System.out.println(i);
		}

	}

	void demo() {
		System.out.println("outer demo");
		System.out.println(o);

	}

}
