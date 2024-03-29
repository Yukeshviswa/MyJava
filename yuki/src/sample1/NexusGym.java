package sample1;

import java.util.Arrays;
import java.util.List;

public class NexusGym {

	 public static void main(String[] args) {
	      
	        double NexusgymLat = 10.999999;
	        double NexusgymLong = 77.280930;
	        double currentLat = 10.994670;
	        double currentLong = 77.288490;

	        double distance = calculateDistance(NexusgymLat, NexusgymLong, currentLat, currentLong);
	        System.out.println("Distance to Nexusgym: " + distance + " kilometers");

	        double MenPrice = 2500.00; 
	        double WomenPrice = 1800.00; 

	      
	        List<String> facilities = Arrays.asList("SPIRIT Cardio Equipment offers various training programs to get the maximum out of every sportsman", "SPIRIT strength equipment is the foundation for any full-service fitness facility", "Group training is a popular way to exercise and a great way to keep your members motivated");

	  
	        System.out.println("\nNexus Gym Details:");
	        System.out.println("Men Price for 1 Month: RS " + MenPrice);
	        System.out.println("Women Price for 1 month: RS " + WomenPrice);
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



