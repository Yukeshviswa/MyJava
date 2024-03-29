package Tech;

import java.util.Scanner;

public class Name1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        String[] names = fullName.split(" ");

        if (names.length >= 2) {
            String abbreviatedFirstName = abbreviateName(names[0]);
            String abbreviatedMiddleName = abbreviateName(names[1]);

            System.out.println(abbreviatedFirstName + "." + abbreviatedMiddleName + "." + names[names.length - 1]);
        } else {
            System.out.println(" Enter full name three words");
        }

        sc.close();
    }

    private static String abbreviateName(String name) {
        return name.substring(0,1);
    }
}