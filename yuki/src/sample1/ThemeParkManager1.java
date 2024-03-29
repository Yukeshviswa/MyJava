package sample1;


import java.util.HashMap;

class Location1 {
    double latitude;
    double longitude;

    public Location1(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}

class Facility1 {
    String name;
    // Additional properties and methods related to facilities can be added here

    public Facility1(String name) {
        this.name = name;
    }
}

class ThemePark11 {
    String name;
    Location1 location;
    HashMap<String, Facility1> facilities1; // Facility name to Facility mapping

    public ThemePark11(String name, Location1 location) {
        this.name = name;
        this.location = location;
        this.facilities1 = new HashMap<>();
    }

    public void addFacility1(String facilityName) {
        Facility1 facility = new Facility1(facilityName);
        facilities1.put(facilityName, facility);
    }
    
    public double calculateDistance(Location1 currentLocation) {
        // Calculate distance between theme park and current location (using coordinates)
        double theta = currentLocation.longitude - this.location.longitude;
        double dist = Math.sin(Math.toRadians(currentLocation.latitude)) * Math.sin(Math.toRadians(this.location.latitude)) +
                      Math.cos(Math.toRadians(currentLocation.latitude)) * Math.cos(Math.toRadians(this.location.latitude)) *
                      Math.cos(Math.toRadians(theta));
        dist = Math.acos(dist);
        dist = Math.toDegrees(dist);
        dist = dist * 60 * 1.1515; // Convert to miles
        return dist;
    }
}

public class ThemeParkManager1 {
    public static void main(String[] args) {
        Location1 currentLocation = new Location1(37, -122); // Example current location (San Francisco)

        ThemePark11 disneyland = new ThemePark11("Disneyland", new Location1(33, -117));
        disneyland.addFacility1("Roller Coaster");
        disneyland.addFacility1("Haunted Mansion");

        ThemePark11 universalStudios = new ThemePark11("Universal Studios", new Location1(34, -118));
        universalStudios.addFacility1("Jurassic Park Ride");
        universalStudios.addFacility1("Wizarding World of Harry Potter");

        // Calculate distances
        double distanceToDisneyland = disneyland.calculateDistance(currentLocation);
        double distanceToUniversalStudios = universalStudios.calculateDistance(currentLocation);

        // Output distances
        System.out.println("Distance to Disneyland: " + distanceToDisneyland + " miles");
        System.out.println("Distance to Universal Studios: " + distanceToUniversalStudios + " miles");
    }
}
