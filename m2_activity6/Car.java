package m2_activity6;

public class Car extends Vehicle implements Refuelable {
	
	public Car(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
		
	}
	
	@Override
	public void startEngine() {
		System.out.println(getBrand() + " car engine started.");
	}
	
	@Override
	public void refuel() {
		System.out.println(getBrand() + " car is refueling.");
	}
}
