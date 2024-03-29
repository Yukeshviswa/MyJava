package smartCity;

import java.util.function.Predicate;

public class Stringem {
    public static void main(String[] args) {
        
        String emptyString = "";
        String nonEmptyString = "Gud, Morning";

       
        Predicate<String> isEmptyPredicate = String::isEmpty;

        
        System.out.println(" emptyString empty: " + isEmptyPredicate.test(emptyString));
        System.out.println(" nonEmptyString empty: " + isEmptyPredicate.test(nonEmptyString));
    }
}
