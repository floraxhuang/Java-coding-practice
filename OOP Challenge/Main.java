
public class Main {

	public static void main(String[] args) {
		Hamburger hamburger = new Hamburger("Big Mac", "Beef", 10.0, "Cinnamon");
		double price = hamburger.custHamburger();
		hamburger.HamburgerAdd1("Tomato", 0.27);
		hamburger.HamburgerAdd2("Lettuce", 0.75);
		hamburger.HamburgerAdd3("Cheese", 1.12);
		System.out.println("With the additions, the burger price becomes $"+hamburger.custHamburger());
		
		HealthyHamburger healthyburger = new HealthyHamburger("Bacon", 4.69);
		healthyburger.HealthyAdd1("Egg", 1.32);
		System.out.println("With the additions, the burger price becomes $"+healthyburger.custHamburger());
		
		DeluxeHamburger deluxe = new DeluxeHamburger();
		deluxe.custHamburger();
	}

}
