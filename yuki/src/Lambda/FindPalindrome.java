package Lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPalindrome {
    public static void main(String[] args) {
        String s = "madam knows malayalam language";
        List<String> words = new ArrayList<>(Arrays.asList(s.split(" ")));

        System.out.println("Palindrome words:");
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word);
            }
        }
    }

    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (!Character.toString(word.charAt(left)).equalsIgnoreCase(Character.toString(word.charAt(right)))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
