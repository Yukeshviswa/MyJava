package smartCity;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Yukesh", "ram", "Akash", "aravind", "kiran");
//
//        // Capitalize the first letter of each name
//        List<String> capitalizedNames = names.stream()
//                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
//                .collect(Collectors.toList());
//
//        // Print the capitalized names
//        System.out.println("Capitalized Names: " + capitalizedNames);
//
//        // Print the count of names
//        System.out.println("Number of Names: " + names.size());
//    }
//}
    //	List<String> names = Arrays.asList("Victoria","Samvuvel","Rolex","Vikram","Santhanam");
    	//import java.util.Arrays;
    	//import java.util.List;

    	//public class LargestNameExample {
    	  //  public static void main(String[] args) {
    	        List<String> names = Arrays.asList("Victoria", "Samvuvel", "Rolex", "Vikram", "Santhanam");
    	     

    	        
    	        String largestName = names.stream()
  	                .max((name1, name2) -> Integer.compare(name1.length(), name2.length()))
   	              .orElse(null);
    	        System.out.println("The largest name is: " + largestName);
    	    }
    	}

//    	        
//				String smallestName=names.stream()
//    	        		.max((name1, name2) -> Integer.compare(name1.length(), name2.length()))
//   	                .orElse(null);
//                 System.out.println("The smallest Name is:"+ smallestName);
//    }
//}
//








    	
    