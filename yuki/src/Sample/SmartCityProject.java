package Sample;
import java.util.Scanner;

public class SmartCityProject {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("User login");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (login(name, password)) {
            System.out.println("Welcome to the Smart City project");
            System.out.print("Enter the country: ");
            String country = scanner.nextLine();
            System.out.print("Enter the state: ");
            String state = scanner.nextLine();
            System.out.print("Enter the district: ");
            String district = scanner.nextLine();
            System.out.print("Enter the panchayat: ");
            String panchayat = scanner.nextLine();

            System.out.print("Do you want to check the ongoing projects? (Yes/No): ");
            String projectChoice = scanner.nextLine();
            
            if (projectChoice.equalsIgnoreCase("yes")) {
                System.out.println("Select the type of project:");
                System.out.println("1. Construction");
                System.out.println("2. Farming");
                System.out.println("3. Road");
                System.out.println("4. Hospital requirements");
                System.out.println("5. Water facilities");
                System.out.println("6. Children park");

                int projectType = scanner.nextInt();
                scanner.nextLine();  // consume the newline

                switch (projectType) {
                    case 1:
                        System.out.println("New build or Maintenance?");
                        // Handle construction specifics
                        break;
                    case 2:
                        // Handle farming specifics
                        break;
                    // Add cases for other project types

                    default:
                        System.out.println("Invalid project type");
                        break;
                }

                System.out.print("Enter the number of employees needed: ");
                int employeesNeeded = scanner.nextInt();
                System.out.print("Enter the salary for employees: ");
                double employeeSalary = scanner.nextDouble();
                System.out.print("Enter the total estimation cost of the project: ");
                double totalEstimationCost = scanner.nextDouble();

                // Process the project details as needed
            }

            System.out.println("Logout");
        } else {
            System.out.println("Invalid login credentials");
        }
    }

    private static boolean login(String name, String password) {
        // Implement your authentication logic here
        // For simplicity, let's assume a basic check
        return name.equals("exampleUser") && password.equals("examplePassword");
    }
}