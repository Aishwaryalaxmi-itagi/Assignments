package checkoutsystem;

public class TestCheckout {
	public static void main(String[] args) {
		Candy candyobj = new Candy("hesshys", 200);

		Cookie cookieobj = new Cookie("peanutButter", 4);
		IceCream iceobj = new IceCream("butterscotch", 100);
		Sundae sundaeobj = new Sundae(100, 100);
		
		DesertItem items[]= {sundaeobj, iceobj, cookieobj, candyobj};
		
		Checkout cart=new Checkout();
		cart.addDesertItems(items);
		System.out.println(cart);
		
		

	}

}
