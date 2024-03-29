package smartCity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class NameProcessor{
    public static void main(String[] args) {
        String name = "yukesh";
        String Lapname="Leno";
        String Mobilename="redmi";
        String Carname="Bmw";
        String Bikename="apache";
        long letterCount = name.chars().filter(Character::isLetter).count();

        System.out.println("Number of letters  name: " + letterCount);
        
        long letterCount1 = Lapname.chars().filter(Character::isLetter).count();

        System.out.println("Number of letters  name: " + letterCount1);
        
      
    }

    }
