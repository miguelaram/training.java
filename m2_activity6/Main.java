package m2_activity6;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(4,"Mitsubishi");
		Truck truck = new Truck(12,"Hyundai");
		
		car.startEngine();
		car.refuel();
		
		truck.startEngine();
		truck.refuel();
		
		destroyVehicle(car);
		destroyVehicle(truck);
	}
	
	static void destroyVehicle(Vehicle vehicle) {
		vehicle.destroy();
	}
}
