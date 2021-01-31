
public class TestCalculator {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		
		System.out.println(c.add(5,5));
		
		System.out.println(c.add(4.5, 0.5));
		
		System.out.println(c.sub(3,6));
		
		System.out.println(c.div(20,5,3));
		
		System.out.println(c.mul(3,3,3));
		
		System.out.println(c.mod(4, 3));
		
		System.out.println(c.fact(5));
	}
}
