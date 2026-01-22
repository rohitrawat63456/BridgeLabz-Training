package VehicleMaintenanceTracker;

public class Truck extends Vehicle {

	Truck(String model, double mileage) {
		super(model, mileage);
	}

	@Override
	public double getMaintenanceCost() {
		double mileage = super.getMileage();
		double cost = mileage * 0.2;
		return cost;
	}
}
