
public class Test {
	public static void main(String[] args) {
		//INPUT FOR EMPLOYEE
		Employee e = new Employee();
		e.Printdetails();

		Employee e1 = new Employee();
		e1.Printdetails();

		Employee e2 = new Employee();
		e1.Printdetails();
		
		Employee emp = new Employee("AAA", 10000, 1000);
		Manager m = new Manager("MMM", 10000, 1000);
		MarketingExecutive me = new MarketingExecutive("MEME", 10000, 1000, 50);

		final Employee emparr[] = { e, m, me, new Employee(), new Employee("LMNO", 10000) };

		for (int i = 0; i < emparr.length; i++) {
			emparr[i].Printdetails();
		}

		
		
		//ADVANCE CALCULATOR
		Calculator c = new Calculator();
		System.out.println(c.add(2, 2));

		AdvancedCalculator ac = new AdvancedCalculator();
		System.out.println(ac.factorial(5));

		System.out.println("Remadinder: " + ac.div(10, 3));

		//UPCASTING

		Calculator ac1 = new AdvancedCalculator();
		System.out.println("Remadinder: " + ac1.div(10, 3));
		System.out.println(c.demo());
		
		
		

		

		/*
		 * Integer m=new Integer(123); System.out.println(m); int q=m.bitCount(m);
		 * System.out.println(q);
		 */

	}

}
