package m2_activity6;

public abstract class Vehicle {
	protected int numberOfWheels;
	protected String brand;
	
	public Vehicle(int numberOfWheels, String brand) {
		this.numberOfWheels = numberOfWheels;
		this.setBrand(brand);
	}
	
	abstract void startEngine();

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void destroy() {
		System.out.println (getBrand().toUpperCase() + " has been destroyed!");
	}
	
}
