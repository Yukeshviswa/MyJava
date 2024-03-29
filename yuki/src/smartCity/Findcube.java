package smartCity;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Findcube {

    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(5,10,15,20,25,30,35,40,45,50);

        List<Integer> result = numbers.stream().map(number -> number * number * number).filter(cubedNumber -> cubedNumber > 500)
                .collect(Collectors.toList());

        
        System.out.println("Cubed numbers greater than 50: " + result);
        } 
    }





//Lambda Expression:
//Nameless function
//no return type
//no modifiers
//lambda expression is used to implement the abstract method
//we can use lambda expression only in function interface

    	
    	
 

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
//    	List<Integer> names=Arrays.asList(10,20,30,40,50,60,70,80);
//    	List<Integer> result=names.stream().map(number-> number*number*number).filter(cubenumber-> cubenumber > 5000).collect(Collectors.toList());
//    	System.out.println("Cuber greater than number is:"+ result);
//    			
//    }
//}








