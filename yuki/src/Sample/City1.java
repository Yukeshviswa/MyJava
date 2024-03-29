package Sample;


import java.util.Scanner;



public class City1 {
	static Scanner sc = new Scanner(System.in);
	private String userName = "";
	private String Password = "";

	City1(String userName, String Password) {

		this.userName = userName;
		this.Password = Password;
	}

	public static boolean login(City1 user) {

		System.out.println("Enter the UserName");
		String userName = sc.nextLine();
		System.out.println("Enter the Password");
		String Password = sc.nextLine();
		return user.userName.equals(userName) && user.Password.equals(Password);
	}

	public static void abc(City1 user) {
		if (login(user)) {
			System.out.println("Login Sucessfully");
		} else {
			System.out.println("Login Failed - Incorrent Username & Password");
		}
	}

	public static void edit(City1 user) {
		System.out.println("Enter the New UserName");
		String newUserName = sc.nextLine();
		System.out.println("Enter the New Password");
		String newPassword = sc.nextLine();
		user.userName = newUserName;
		user.Password = newPassword;

	}

	static String country = "";
	static String state = "";
	static String district = "";
	static String panchayat = "";

	public static void country(City1 user) {

		System.out.println("Enter the Country");
		country = sc.nextLine();
		System.out.println("Enter the State");
		state = sc.nextLine();
		System.out.println("Enter the District");
		district = sc.nextLine();
		System.out.println("Enter the Panchayat");
		panchayat = sc.nextLine();
	}

	public static void project(City1 user) {
		System.out.println(""
				+ "\n 1.Construction "
				+ "\n 2.Farming "
				+ "\n 3.Road "
				+ "\n 4.Hospital Requirements "
				+ "\n 5.Water Facilities "
				+ "\n 6.Childrens Park "
				+ "\nPress 0: Back "
				+ "\nPress 7: Home");
		
		int n = sc.nextInt();
		switch(n) {
		case 1:
			construction(user);
			break;
		case 0:
			country(user);
			break;
		case 7:
			details(user);
			break;
			default:
				System.out.println("--Wrong Input--");
				
				project(user);
				break;
		}
		}
	

	public static void print(City1 user) {
		System.out.println("Country   : " + country);
		System.out.println("State 	  : " + state);
		System.out.println("District  : " + district);
		System.out.println("Panchayat : " + panchayat);

	}

	public static void construction(City1 user) {
		
		System.out.println("*Welcome to construction on going projects*");
		System.out.println(""
				+ "\nPress 1: Cotton Industry "
				+ "\nPress 2: Oil Industry "
				+ "\nPress 3: Masala Industry"
				+ "\nPress 0: Back ");

		int on = sc.nextInt();

		int employee = 0;
		int salary = 0;
		int month_salary = 0;
		int estimate = 0;
		int days = 0;

		switch (on) {

		case 1:
			System.out.println("How Many Employes Needed for this Project");
			employee = sc.nextInt();
			System.out.println("Salary for Employees per day");
			salary = sc.nextInt();
			System.out.println("No.of Days");
			days = sc.nextInt();
			month_salary = salary * days;
			System.out.println("Total Estimate cost of the project");
			estimate = sc.nextInt();
			break;

		case 2:
			System.out.println("How Many Employes Needed for this Project");
			employee = sc.nextInt();
			System.out.println("Salary for Employees per day");
			salary = sc.nextInt();
			System.out.println("No.of Days");
			days = sc.nextInt();
			month_salary = salary * days;
			System.out.println("Total Estimate cost of the project");
			estimate = sc.nextInt();
			break;

		case 3:
			System.out.println("How Many Employes Needed for this Project");
			employee = sc.nextInt();
			System.out.println("Salary for Employees per day");
			salary = sc.nextInt();
			System.out.println("No.of Days");
			days = sc.nextInt();
			month_salary = salary * days;
			System.out.println("Total Estimate cost of the project");
			estimate = sc.nextInt();
			break;

		case 0:
			project(user);
			break;
			default:
				System.out.println("Wrong Input\n");
				construction(user);
				break;
		}
		while(true) {
		System.out.println(""
				+ "\nPress 1: Print Details "
				+ "\nPress 2: Back "
				+ "\nPress 3: Home");
		int mmm = sc.nextInt();
		sc.nextLine();

		switch (mmm) {

		case 1:
			print(user);
			System.out.println("No.of.Employees  :" + employee);
			System.out.println("Per Day Salary 	 :" + salary);
			System.out.println("Per Month salary :" + month_salary);
			System.out.println("Total Estimate	 :" + estimate);
			System.out.println("\n");
			break;
			
		case 2:
			construction(user);
			break;
		case 3:
			project(user);
			break;
			default:
				System.out.println("--Wrong Inpur--");
				construction(user);
				break;
		}
		}
	}
	public static void uniq(City1 user) {
		System.out.println("\nPress 1: Login " + "\nPress 2: Edit the Information ");
		int ss = sc.nextInt();
		sc.nextLine();

		switch (ss) {
		case 1:
			abc(user);
			details(user);
			break;

		case 2:
			edit(user);
			System.out.println("Update Information Sucessfully");
			break;

		}
	}


	public static void details(City1 user) {
		System.out.println("-----WELCOME TO SMARTCITY-----\n");
		country(user);
		System.out.println("If you want to check the ongoing projects");
		System.out.println(""
				+ "\nPress 1: Yes "
				+ "\nPress 2: No (means Logout) "
				+ "\nPress 5: Login page");
		int mm = sc.nextInt();
		switch (mm) {
		case 1:
			project(user);
			int bd = sc.nextInt();
			switch(bd) {
			case 1:
				construction(user);
				break;
			}
			break;
		case 2:
			if (mm == 2) {
				System.out.println("Logout Sucessfully");
				System.out.println("If you want to login kindly press 5");
				int ab = sc.nextInt();
				switch (ab) {
				case 5:
					uniq(user);
					break;
				}
				break;
			}
		case 5:
			uniq(user);
			break;
		default:
			details(user);
			break;
		}
	}

	
	public static void main(String args[]) {
		City1 user = new City1("Uniq", "1234");
		City1.uniq(user);
	}
}