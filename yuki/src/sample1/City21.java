package sample1;
import java.util.Scanner;

public class City21 {
	static Scanner sc = new Scanner(System.in);
	private String userName = "";
	private String Password = "";
	static String country = "";
	static String state = "";
	static String district = "";
	static String panchayat = "";
	static boolean isback = true;
	static int ss = 0;

	City21(String userName, String Password) {

		this.userName = userName;
		this.Password = Password;
	}

	public static boolean login(City21 user) {

		System.out.println("Enter the UserName");
		String userName = sc.next();
		System.out.println("Enter the Password");
		String Password = sc.next();
		return user.userName.equals(userName) && user.Password.equals(Password);
		
		
	}

	public static void edit(City21 user) {
			
		System.out.println("Enter new username:");
        String newUsername = sc.next();
        System.out.println("Enter new password:");
        String newPassword = sc.next();
        user.userName=newUsername;
        user.Password=newPassword;
	
	}

	public static void country(City21 user) {
		System.out.println("Enter the Project Details YES/NO");
		String dt = sc.next();
		switch(dt) {
		case "YES":

			System.out.println("Enter the Country");
			country = sc.next();
			System.out.println("Enter the State");
			state = sc.next();
			System.out.println("Enter the District");
			district = sc.next();
			System.out.println("Enter the Panchayat");
			panchayat = sc.next();
			break;
		case "NO":
			Ukes(user);
			break;
			default:
				System.out.println("Wrong Input.....");
				country(user);
				break;
				
			}
	}
private static void Ukes(City21 user) {
		// TODO Auto-generated method stub
		
	}
public class New3 {
	
	public static void Clinic_Facilities(City2 user) {
		System.out.println("*Welcome to Harshad Clinic*");
		System.out.println(""
				+ "\nPress 1: Firsteid Treatment "
				+ "\nPress 2: Low Pressure Checking "
				+ "\nPress 3: Consultant Doctor"
				+ "\nPress 0: Back ");
		
	}
	
	
public class New33{

public static void main(String args[]) {
	City21 user = new City21("Ukes", "4321");
	City21.Ukes(user);
}
}
}}