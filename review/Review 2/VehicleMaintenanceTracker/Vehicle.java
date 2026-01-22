package VehicleMaintenanceTracker;

public abstract class Vehicle {
	private final String model;
	private final double mileage;

	Vehicle(String model, double mileage) {
		this.model = model;
		this.mileage = mileage;
	}

	public double getMileage() {
		return this.mileage;
	}

	public abstract double getMaintenanceCost();

}
