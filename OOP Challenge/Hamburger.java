
public class Hamburger {
	private String name;
	private String meat;
	private double price;
	private String breadroll;
	
	private String addition1Name;
	private double addition1Price;
	private String addition2Name;
	private double addition2Price;
	private String addition3Name;
	private double addition3Price;
	private String addition4Name;
	private double addition4Price;
	
	public Hamburger(String name, String meat, double price, String breadroll) {
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadroll = breadroll;
	}
	
	public void HamburgerAdd1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
	}
	
	public void HamburgerAdd2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
	}
	
	public void HamburgerAdd3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
	}
	
	public void HamburgerAdd4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
	}
	
	public double custHamburger() {
		double hamburgerprice = this.price;
		System.out.println(this.name + " hamburger with a "+ this.breadroll +" is $"+ this.price);
		if(this.addition1Name!=null) {
			hamburgerprice+=this.addition1Price;
			System.out.println(this.addition1Name+" added. Adding $"+ this.addition1Price);
		}
		
		if(this.addition2Name!=null) {
			hamburgerprice+=this.addition2Price;
			System.out.println(this.addition2Name+" added. Adding $"+ this.addition2Price);
		}
		
		if(this.addition3Name!=null) {
			hamburgerprice+=this.addition3Price;
			System.out.println(this.addition3Name+" added. Adding $"+ this.addition3Price);
		}
		
		if(this.addition4Name!=null) {
			hamburgerprice+=this.addition4Price;
			System.out.println(this.addition4Name+" added. Adding $"+ this.addition4Price);
		}
		
		return hamburgerprice;
	}
	
}
