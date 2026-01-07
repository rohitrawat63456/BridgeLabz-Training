package ObjectOrientedProgrammin;

import java.util.*;

class User {
	String name;
	int age;
	String gender;

	User(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getUserName() {
		return this.name;
	}
}

class Driver {
	String driverName;
	int age;
	String carName;
	String carNumber;
	boolean availability;

	Driver(String name, int age, String carName, String carNumber) {
		this.driverName = name;
		this.age = age;
		this.carName = carName;
		this.carNumber = carNumber;
		availability = true;
	}

	public boolean isAvailable() {
		return availability;
	}

	public String getDriverName() {
		return this.driverName;
	}
}

class DriverServices {
	static HashMap<Integer, Driver> driverDetails = new HashMap<>();

	public int generateDriverId() {
		int newDriverId = -1;
		while (true) {
			int generatedId = (int) (Math.random() * 100);
			if (!driverDetails.containsKey(generatedId)) {
				newDriverId = generatedId;
				break;
			}
		}
		return newDriverId;
	}

	public void addDriver(Driver newDriver) {
		int newDriverId = generateDriverId();
		driverDetails.put(newDriverId, newDriver);

	}

	static boolean isDriverAvailable() {
		for (int d : driverDetails.keySet()) {
			if (driverDetails.get(d).availability) {
				return true;
			}

		}
		return false;
	}

	static Driver getDriver() {
		Driver availableDriver = null;
		for (int d : driverDetails.keySet()) {
			if (driverDetails.get(d).availability) {
				availableDriver = driverDetails.get(d);
				break;
			}

		}
		availableDriver.availability = false;
		return availableDriver;
	}

}

interface FareCalculator {
	double calculateFair(double distance);
}

class Ride implements FareCalculator {
	User user;
	double distance;
	Driver assignedDriver;
	double rideFair;

	Ride(User user, double distance) {
		this.user = user;
		this.distance = distance;
		rideFair = calculateFair(distance);
		assignNewDriver();
	}

	@Override
	public double calculateFair(double distance) {
		double totalFair = distance * 15;
		return totalFair;
	}

	public void assignNewDriver() {
		if (DriverServices.isDriverAvailable()) {
			assignedDriver = DriverServices.getDriver();
		}
	}

}

class BookRide {
	Ride ride;

	BookRide(User user, double distance) {
		ride = new Ride(user, distance);

	}

	public String rideDetails() {
		return "userName : " + ride.user.name + "\n" + "distance : " + ride.distance + "\n" + "Driver Name : "
				+ ride.assignedDriver.driverName + "\n" + "Car Name : " + ride.assignedDriver.carName + "\n"
				+ "Total fair : " + ride.rideFair;
	}

}

public class RideManagementSystem {
	static HashMap<Integer, User> userDetails = new HashMap<>();

	public static int generateUserId() {
		int newUserId = -1;
		while (true) {
			int generatedId = (int) (Math.random() * 100);
			if (!userDetails.containsKey(generatedId)) {
				newUserId = generatedId;
				break;
			}
		}
		return newUserId;
	}

	public static void main(String[] args) {
		User u1 = new User("Rohit Rawat", 21, "Male");
		User u2 = new User("Ronit", 21, "Male");
		User u3 = new User("Nancy", 21, "Female");
		User u4 = new User("Rajesh", 22, "Male");
		int newUserId = generateUserId();
		userDetails.put(newUserId, u1);

		DriverServices us = new DriverServices();
		Driver d1 = new Driver("Raj Bahadur", 28, "Tata Safari", "UP 80 AJ 0047");
		Driver d2 = new Driver("Nived Agrawal", 45, "Tata Tiago", "UP 80 AJ 7658");
		Driver d3 = new Driver("Priyanshu", 30, "Tata Punch", "UP 83 BJ 1270");
		Driver d4 = new Driver("Rahul", 28, "Lord alto 800", "HR 50 K 0520");
		us.addDriver(d1);
		us.addDriver(d2);
		us.addDriver(d3);
		us.addDriver(d4);

		BookRide r1 = new BookRide(u1, 20);
		BookRide r2 = new BookRide(u2, 30);
		BookRide r3 = new BookRide(u3, 15);
		BookRide r4 = new BookRide(u4, 12);

		System.out.println(r1.rideDetails()+"\n");
		System.out.println(r2.rideDetails()+"\n");
		System.out.println(r3.rideDetails()+"\n");
		System.out.println(r4.rideDetails()+"\n");

	}

}
