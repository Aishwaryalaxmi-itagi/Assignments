package practise;

/**
 * Interface continue, Strings and string functions Inner class, Lambda,
 *  exception handling, colllection Introduction and practise problems
 */
import practise.Outer.Inner;

public class Test extends Inner {
	public static void main(String[] args) {

		// System.out.println(s.replace("h", "H"));

		StringBuffer sbuf = new StringBuffer("Hello");
		StringBuilder sbul = new StringBuilder("world");

		Outer out = new Outer();
		Inner in = new Inner();
		out.demo();
		in.demo();

		Perform1 p1 = new Perform1();
		System.out.println(p1.performAction(2, 2));

		Perform2 p2 = new Perform2();
		System.out.println(p2.performAction(2, 2));

	}

}
