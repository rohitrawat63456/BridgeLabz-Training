package VehicleMaintenanceTracker;

public class VehicleMaintenance {

	public static void main(String[] args) {

		Truck truck = new Truck("Tata 400", 10000);

		Car car = new Car("Tata Punch", 2025);

		System.out.printf("Car maintenace cost is %.2f \n", car.getMaintenanceCost());
		System.out.printf("Truck mainteanace cost is %.2f \n", truck.getMaintenanceCost());

	}

}
