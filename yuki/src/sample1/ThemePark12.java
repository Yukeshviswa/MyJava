package sample1;
import java.util.*;

public class ThemePark12 {
    public static void main(String[] args) {
      
        double blackThunderLat = 11.4014;
        double blackThunderLong = 76.5604;
        double currentLat = 10.994670;
        double currentLong = 77.288490;

        double distance = calculateDistance(blackThunderLat, blackThunderLong, currentLat, currentLong);
        System.out.println("Distance to Black Thunder: " + distance + " kilometers");

        double childPrice = 500.00; 
        double adultPrice = 800.00; 

      
        List<String> facilities = Arrays.asList("Water Rides", "Dry Rides", "Wave Pool","Food Court");

  
        System.out.println("\nBlack Thunder Details:");
        System.out.println("Child Price: RS" + childPrice);
        System.out.println("Adult Price: RS" + adultPrice);
        System.out.println("Facilities:");
        for (String facility : facilities) {
            System.out.println("- " + facility);
        }
    }

   
    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double R = 6371; 
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c;
    }
}
