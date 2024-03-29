package smartCity;
import java.util.HashSet;

public class Findrs {
    public static void main(String[] args) {
        String inputString = "abcdefgha";

        char firstRepeatedChar = findFirstRepeatedCharacter(inputString);

        if (firstRepeatedChar != '\0') {
            System.out.println("First repeated character: " + firstRepeatedChar);
        } else {
            System.out.println("No repeated characters found.");
        }
    }

    private static char findFirstRepeatedCharacter(String input) {
        HashSet<Character> ss1 = new HashSet<>();

        return input.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> !ss1.add(ch))
                .findFirst()
                .orElse('\0');
    }
}
