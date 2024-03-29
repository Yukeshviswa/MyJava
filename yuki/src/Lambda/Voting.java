package Lambda;
import java.util.HashMap;
import java.util.Scanner;

public class Voting {
	private static String get_Candidate_Name(int choice) {
        if (choice == 1) {
            return "Candidate 1";
        } else if (choice == 2) {
            return "Candidate 2";
        } else if (choice == 3) {
            return "Candidate 3";
        } else {
            throw new IllegalArgumentException("Invalid candidate number: " + choice);
        }
	}
    public static void main(String[] args) {
        
        HashMap<String, Integer> voteCounts = new HashMap<>();
        voteCounts.put("Candidate 1", 0);
        voteCounts.put("Candidate 2", 0);
        voteCounts.put("Candidate 3", 0);

        
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            System.out.println("Enter the number of the candidate you want to vote for:");
            System.out.println("1. Candidate 1");
            System.out.println("2. Candidate 2");
            System.out.println("3. Candidate 3");
            System.out.println("4. Quit");

                    int choice = scanner.nextInt();

        
            if (choice == 4) {
                break;
            }

        
            int currentCount = voteCounts.get(get_Candidate_Name(choice));
            voteCounts.put(get_Candidate_Name(choice), currentCount + 1);

        
            System.out.println("Current vote counts:");
            for (String candidate : voteCounts.keySet()) {
                System.out.println(candidate + ": " + voteCounts.get(candidate));
            }
        }

                scanner.close();
    }

}
