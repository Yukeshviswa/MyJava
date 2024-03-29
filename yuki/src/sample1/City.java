package sample1;


import java.util.Scanner;

public class City {
	static Scanner sc = new Scanner(System.in);
	private String userName = "";
	private String Password = "";
	static String country = "";
	static String state = "";
	static String district = "";
	static String panchayat = "";
	static boolean isback = true;
	static int ss = 0;

	City(String userName, String Password) {

		this.userName = userName;
		this.Password = Password;
	}

	public static boolean login(City user) {

		System.out.println("Enter the UserName");
		String userName = sc.next();
		System.out.println("Enter the Password");
		String Password = sc.next();
		return user.userName.equals(userName) && user.Password.equals(Password);
		
		
	}

	public static void edit(City user) {
			
		System.out.println("Enter new username:");
        String newUsername = sc.next();
        System.out.println("Enter new password:");
        String newPassword = sc.next();
        user.userName=newUsername;
        user.Password=newPassword;
	
	}

	public static void country(City user) {
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
			uniq(user);
			break;
			default:
				System.out.println("Wrong Input.....");
				country(user);
				break;
				
			}
	}

	public static void project(City user) {
		System.out.println(""
				+ "\n 1.Construction "
				+ "\n 2.Farming "
				+ "\n 3.Road "
				+ "\n 4.Hospital Requirements "
				+ "\n 5.Water Facilities "
				+ "\n 6.Childrens Park "
				+ "\n Press 0: Back "
				+ "\n Press 7: Menu");
		
		int n = sc.nextInt();
		switch(n) {
		case 1:
			Construction(user);
			break;
		case 2:
			Farming(user);
			break;
		case 3:
			Road_Facilities(user);
			break;
		case 4:
			Haspital_RequireMents(user);
			break;
		case 5:
			Water_Facilities(user);
			break;
		case 6:
			Childrens_Park(user);
			break;
		case 0:
			details(user);
			break;
		case 7:
			uniq(user);
			break;
			default:
				System.out.println("--Wrong Input--");
				project(user);
				break;
		}
		}
	
	public static void details(City user) {
		System.out.println("\n-----WELCOME TO SMARTCITY-----\n");
		country(user);
		System.out.println("If you want to check the ongoing projects");
		System.out.println(""
				+ "\nPress 1: Yes "
				+ "\nPress 2: No (means Logout.....)");
		int mm = sc.nextInt();
		switch (mm) {
		case 1:
			project(user);
			break;
		case 2:
			if (mm == 2) {
				System.out.println("Logout Sucessfully........");
				System.out.println("If you want to login kindly press 5");
				int ab = sc.nextInt();
				switch (ab) {
				case 5:
					uniq(user);
					break;
				}
				break;
			}
			default:
				details(user);
				break;
		}
		
	}
		
	public static void uniq(City user) {
		
		while(true) {
		System.out.println(""
				+ "\nPress 1: Login "
				+ "\nPress 2: Edit the Information "
				+ "\nPress 0: Logout");
		ss = sc.nextInt();
		if(ss==1) {
			if(login(user)) {
				System.out.println("Login Sucessfully");
			}
			else {
				System.out.println("Login Failed - Invalid Username & Password");
				uniq(user);
				break;
			}
			details(user);
			break;
			}
		else if(ss==2) {
			edit(user);
			System.out.println("Update Information Sucessfully");
			uniq(user);
			break;
		}
		else if(ss==0) {
			isback=false;
			System.out.println("\nLogout Sucessfully....."
					+ "\nTHANK YOU");
			break;
		}
		else {
			System.out.println("Invalid Input");
		}
		}
	}
	
	public static void print(City user) {
		System.out.println("Country   : " + country);
		System.out.println("State 	  : " + state);
		System.out.println("District  : " + district);
		System.out.println("Panchayat : " + panchayat);

	}

	public static void Construction(City user) {
		
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
				Construction(user);
				break;
		}
		
		while(isback) {
		System.out.println(""
				+ "\nPress 1: Print Details "
				+ "\nPress 2: Back "
				+ "\nPress 3: Home");
		int mmm = sc.nextInt();
		
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
			Construction(user);
			break;
		case 3:
			project(user);
			break;
			default:
				System.out.println("--Wrong Input--");
				Construction(user);
				break;
		}
		
		}
		
	}
	
	public static void Farming(City user) {
		
		System.out.println("*Welcome to Farming on going projects*");
		System.out.println(""
				+ "\nPress 1: Subsistence Farming "
				+ "\nPress 2: Dryland Farming "
				+ "\nPress 3: Commercial Farming"
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
				Farming(user);
				break;
		}
		while(isback) {
		System.out.println(""
				+ "\nPress 1: Print Details "
				+ "\nPress 2: Back "
				+ "\nPress 3: Home");
		int mmm = sc.nextInt();
		
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
			Farming(user);
			break;
		case 3:
			project(user);
			break;
			default:
				System.out.println("--Wrong Input--");
				Farming(user);
				break;
		}
		}
	}

	public static void Road_Facilities(City user) {
	
	System.out.println("*Welcome to Road Facilities on going projects*");
	System.out.println(""
			+ "\nPress 1: WBM Roads "
			+ "\nPress 2: Gravel Roads "
			+ "\nPress 3: Concreate Roads"
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
			Road_Facilities(user);
			break;
	}
	while(isback) {
	System.out.println(""
			+ "\nPress 1: Print Details "
			+ "\nPress 2: Back "
			+ "\nPress 3: Home");
	int mmm = sc.nextInt();
	
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
		Road_Facilities(user);
		break;
	case 3:
		project(user);
		break;
		default:
			System.out.println("--Wrong Input--");
			Road_Facilities(user);
			break;
	}
	}
}

	public static void Haspital_RequireMents(City user) {
	
	System.out.println("*Welcome to Hospital RequireMents on going projects*");
	System.out.println(""
			+ "\nPress 1: Clinic "
			+ "\nPress 2: 10 Bedded Hospital Requirements "
			+ "\nPress 3: Pharmacy"
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
			Haspital_RequireMents(user);
			break;
	}
	while(isback) {
	System.out.println(""
			+ "\nPress 1: Print Details "
			+ "\nPress 2: Back "
			+ "\nPress 3: Home");
	int mmm = sc.nextInt();
	
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
		Haspital_RequireMents(user);
		break;
	case 3:
		project(user);
		break;
		default:
			System.out.println("--Wrong Input--");
			Haspital_RequireMents(user);
			break;
	}
	}
}

	public static void Water_Facilities(City user) {
	
	System.out.println("*Welcome to Water Facilities on going projects*");
	System.out.println(""
			+ "\nPress 1: Reservoirs "
			+ "\nPress 2: Water Tanks "
			+ "\nPress 3: Water Towers"
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
			Water_Facilities(user);
			break;
	}
	while(isback) {
	System.out.println(""
			+ "\nPress 1: Print Details "
			+ "\nPress 2: Back "
			+ "\nPress 3: Home");
	int mmm = sc.nextInt();
	
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
		Water_Facilities(user);
		break;
	case 3:
		project(user);
		break;
		default:
			System.out.println("--Wrong Input--");
			Water_Facilities(user);
			break;
	}
	}
}

	public static void Childrens_Park(City user) {
	
	System.out.println("*Welcome to Childrens Park on going projects*");
	System.out.println(""
			+ "\nPress 1: Themed Playgrounds "
			+ "\nPress 2: Adventure Playground "
			+ "\nPress 3: Fitness Playground"
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
			Childrens_Park(user);
			break;
	}
	while(isback) {
	System.out.println(""
			+ "\nPress 1: Print Details "
			+ "\nPress 2: Back "
			+ "\nPress 3: Home");
	int mmm = sc.nextInt();
	
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
		Childrens_Park(user);
		break;
	case 3:
		project(user);
		break;
		default:
			System.out.println("--Wrong Input--");
			Childrens_Park(user);
			break;
	}
	}
}

	public static void main(String args[]) {
		City user = new City("Uniq", "1234");
		City.uniq(user);
	}
}