
public class DeluxeHamburger extends Hamburger {

	public DeluxeHamburger() {
		super("Deluxe Hamburger", "Beef", 14.1, "White");
		// TODO Auto-generated constructor stub
		super.HamburgerAdd1("chips", 1.8);
		super.HamburgerAdd2("drinks", 2.3);
	}

	@Override
	public void HamburgerAdd1(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Can't add items to deluxe hamburger");
	}

	@Override
	public void HamburgerAdd2(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Can't add items to deluxe hamburger");
	}

	@Override
	public void HamburgerAdd3(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Can't add items to deluxe hamburger");
	}

	@Override
	public void HamburgerAdd4(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Can't add items to deluxe hamburger");
	}
	
	
	
	
}
