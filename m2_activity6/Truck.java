package m2_activity6;

public class Truck extends Vehicle implements Refuelable {
	
	public Truck(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
	}
	
	@Override
	public void startEngine() {
		System.out.println(getBrand() + " truck engine started.");
	}
	
	@Override
	public void refuel() {
		System.out.println(getBrand() + " truck is refueling.");
	}
}
