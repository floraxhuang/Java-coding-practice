
public class HealthyHamburger extends Hamburger {
	
	private String HealthyExtra1Name;
	private double HealthyExtra1Price;
	
	private String HealthyExtra2Name;
	private double HealthyExtra2Price;
	
	public HealthyHamburger(String meat, double price) {
		super("Healthy", meat, price, "Brown Rye");
	}
	
	public void HealthyAdd1(String name, double price) {
		this.HealthyExtra1Name = name;
		this.HealthyExtra1Price = price;
	}
	
	public void HealthyAdd2(String name, double price) {
		this.HealthyExtra2Name = name;
		this.HealthyExtra2Price = price;
	}

	@Override
	public double custHamburger() {
		// TODO Auto-generated method stub
		double baseprice = super.custHamburger();
		
		if(this.HealthyExtra1Name!=null) {
			baseprice+=HealthyExtra1Price;
			System.out.println(this.HealthyExtra1Name+" added. Adding $"+ this.HealthyExtra1Price);
		}
		
		if(this.HealthyExtra2Name!=null) {
			baseprice+=HealthyExtra2Price;
			System.out.println(this.HealthyExtra2Name+" added. Adding $"+ this.HealthyExtra2Price);
		}
		
		return baseprice;
		
	}
	
	
	
	
	
	

}
