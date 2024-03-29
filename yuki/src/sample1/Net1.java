package sample1;

public class Net1 {

	import java.util.HashMap;

	class Location {
	    double latitude;
	    double longitude;

	    public Location(double latitude, double longitude) {
	        this.latitude = latitude;
	        this.longitude = longitude;
	    }
	}

	class Facility {
	    String name;
	    // Additional properties and methods related to facilities can be added here

	    public Facility(String name) {
	        this.name = name;
	    }
	}

	class ThemePark {
	    String name;
	    Location location;
	    HashMap<String, Facility> facilities; // Facility name to Facility mapping

	    public ThemePark(String name, Location location) {
	        this.name = name;
	        this.location = location;
	        this.facilities = new HashMap<>();
	    }

	    public void addFacility(String facilityName) {
	        Facility facility = new Facility(facilityName);
	        facilities.put(facilityName, facility);
	    }
	    
	    public double calculateDistance(Location currentLocation) {
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

	public class Net1 {
	    public static void main(String[] args) {
	        Location currentLocation = new Location(37.7749, -122.4194); // Example current location (San Francisco)

	        ThemePark disneyland = new ThemePark("Disneyland", new Location(33.8121, -117.9190));
	        disneyland.addFacility("Roller Coaster");
	        disneyland.addFacility("Haunted Mansion");

	        ThemePark universalStudios = new ThemePark("Universal Studios", new Location(34.1381, -118.3534));
	        universalStudios.addFacility("Jurassic Park Ride");
	        universalStudios.addFacility("Wizarding World of Harry Potter");

	        // Calculate distances
	        double distanceToDisneyland = disneyland.calculateDistance(currentLocation);
	        double distanceToUniversalStudios = universalStudios.calculateDistance(currentLocation);

	        // Output distances
	        System.out.println("Distance to Disneyland: " + distanceToDisneyland + " miles");
	        System.out.println("Distance to Universal Studios: " + distanceToUniversalStudios + " miles");
	    }
	}

}