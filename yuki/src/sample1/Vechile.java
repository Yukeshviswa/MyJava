package sample1;

import java.util.ArrayList;
import java.util.List;

// Vehicle class representing a vehicle in the smart city
class Vechile {
    private String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}

// SmartParkingSystem class representing the smart parking system
class SmartParkingSystem {
    private List<Vehicle> parkedVehicles;

    public SmartParkingSystem() {
        this.parkedVehicles = new ArrayList<>();
    }

    public void parkVehicle(Vehicle vehicle) {
        parkedVehicles.add(vehicle);
        System.out.println("Vehicle with license plate " + vehicle.getLicensePlate() + " parked successfully.");
    }

    public void unparkVehicle(Vehicle vehicle) {
        if (parkedVehicles.remove(vehicle)) {
            System.out.println("Vehicle with license plate " + vehicle.getLicensePlate() + " unparked successfully.");
        } else {
            System.out.println("Vehicle with license plate " + vehicle.getLicensePlate() + " not found in the parking system.");
        }
    }

    public void displayParkedVehicles() {
        System.out.println("Parked Vehicles:");
        for (Vehicle vehicle : parkedVehicles) {
            System.out.println("- " + vehicle.getLicensePlate());
        }
    }
}

// Main class to demonstrate the smart city system
public class SmartCityDemo {
    public static void main(String[] args) {
        // Create a smart parking system
        SmartParkingSystem smartParkingSystem = new SmartParkingSystem();

        // Create vehicles
        Vehicle vehicle1 = new Vehicle("ABC123");
        Vehicle vehicle2 = new Vehicle("XYZ789");

        // Park vehicles
        smartParkingSystem.parkVehicle(vehicle1);
        smartParkingSystem.parkVehicle(vehicle2);

        // Display parked vehicles
        smartParkingSystem.displayParkedVehicles();

        // Unpark a vehicle
        smartParkingSystem.unparkVehicle(vehicle1);

        // Display parked vehicles after unparking
        smartParkingSystem.displayParkedVehicles();
    }
}
