package VehicleMaintenanceTracker;

public class Car extends Vehicle {

	Car(String model, double mileage) {
		super(model, mileage);
	}

	@Override
	public double getMaintenanceCost() {
		double mileage = super.getMileage();
		double cost = mileage * 0.1;
		return cost;
	}
}
