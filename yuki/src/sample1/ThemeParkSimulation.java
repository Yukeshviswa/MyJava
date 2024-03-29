package sample1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ThemePark {
    private static final double THEME_PARK_LATITUDE = 0;
    private static final double THEME_PARK_LONGITUDE = 0;

    private Map<String, Double> facilities;

    public ThemePark() {
        facilities = new HashMap<>();
        facilities.put("Roller Coaster", 2.5);  // Distance in miles
        facilities.put("Water Park", 1.8);
        facilities.put("Food Court", 1.0);
    }

    public double calculateDistance(double userLatitude, double userLongitude) {
        double distance = Math.sqrt(Math.pow(userLatitude - THEME_PARK_LATITUDE, 2) +
                                    Math.pow(userLongitude - THEME_PARK_LONGITUDE, 2));
        return distance;
    }

    public void displayFacilities() {
        System.out.println("Facilities in the Theme Park:");
        for (Map.Entry<String, Double> entry : facilities.entrySet()) {
            System.out.println(entry.getKey() + " - Distance: " + entry.getValue() + " miles");
        }
    }
}

public class ThemeParkSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Theme Park Simulation!");

        ThemePark themePark = new ThemePark();
        themePark.displayFacilities();

        System.out.print("\nEnter your current latitude: ");
        double userLatitude = scanner.nextDouble();

        System.out.print("Enter your current longitude: ");
        double userLongitude = scanner.nextDouble();

        double distanceToThemePark = themePark.calculateDistance(userLatitude, userLongitude);

        System.out.println("\nDistance to the Theme Park: " + distanceToThemePark + " miles");

        scanner.close();
    }
}
