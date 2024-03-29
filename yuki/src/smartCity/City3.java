package smartCity;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class City3 {
	static Scanner sc = new Scanner(System.in);
	private String userName = "", Password = "";
	
	static String country, state, district, panchayat, village ;	
	static boolean isback = true;
	static int ss = 0;

	City3(String userName, String Password) {

		this.setUserName(userName);
		this.setPassword(Password);
	}

	public static boolean login(City3 user) {

		System.out.println("Enter the UserName");
		String userName = sc.next();
		System.out.println("Enter the Password");
		String Password = sc.next();
		return user.getUserName().equals(userName) && user.getPassword().equals(Password);
	}

	public static void edit(City3 user) {
			
		System.out.println("Enter new username:");
        String newUsername = sc.next();
        System.out.println("Enter new password:");
        String newPassword = sc.next();
        user.setUserName(newUsername);
        user.setPassword(newPassword);
	}

	public static void country(City3 user) {
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

	public static void project(City3 user) {
		System.out.println(""
				+ "\n 1.Construction "
				+ "\n 2.Farming "
				+ "\n 3.Road "
				+ "\n 4.Water Facilities "
				+ "\n 5.Childrens Park "
				+ "\n 6.Hospital Requirments "
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
			Water_Facilities(user);
			break;
		case 5:
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
	
	public static void details(City3 user) {
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
		
	public static void uniq(City3 user) {
		
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
	
	public static void print(City3 user) {
		System.out.println("Country             :" + country);
		System.out.println("State 	            :" + state);
		System.out.println("District            :" + district);
		System.out.println("Panchayat           :" + panchayat);

	}

	public static void Construction(City3 user) {
		
		System.out.println("*Welcome to construction on going projects*");
		System.out.println(""
				+ "\nPress 1: Cotton Industry "
				+ "\nPress 2: Oil Industry "
				+ "\nPress 3: Masala Industry"
				+ "\nPress 0: Back ");

		int on = sc.nextInt();
		
		String name = "";
		
		switch (on) {

		case 1:
			System.out.println("\n1.Cotton Matirials \n"
					+ "2.New Cotton Company "
					+ "\n0.Back");
			int cott = sc.nextInt();
			int employee;
			switch(cott) {
			case 1:
				double totalWholesalePrice = 0, totalRetailPrice = 0;
		      
				System.out.println("Enter the Matirial Name");
				name = sc.next();
				System.out.println("Enter the weight in kg:");
		        double weight = sc.nextDouble();
		        System.out.println("Enter the tax rate:");
		        double taxRate = sc.nextDouble();
		        

		        for (int i = 0; i < 2; i++) {
		            System.out.println("Enter the transaction type (1 - Wholesale, 2 - Retail):");
		            int transactionType = sc.nextInt();
		            System.out.println("Enter the price per kg:");
		            double price = sc.nextDouble();

		            double totalPrice = weight * price + weight * price * taxRate / 100;
		           
		            if (transactionType == 1) {
		                totalWholesalePrice += totalPrice;
		            } else if (transactionType == 2) {
		                totalRetailPrice += totalPrice;
		            } else {
		                System.out.println("Invalid transaction type. Please enter 1 or 2.");
		            }
		            print(user);
		            System.out.println("Matirial Name       :"+name);
		            System.out.println("Matirial Weight     :"+weight);
		            System.out.println("Tax Rate            :"+taxRate);
		            System.out.println("Per Kg Price        :"+price);
		            System.out.printf("Total wholesale price with tax : %.2f%n", totalWholesalePrice);
			        System.out.printf("Total retail price with tax    : %.2f%n", totalRetailPrice);
		        }
			        
			        while(isback) {
						System.out.println(""
								+ "\nPress 0: Back ");
						int cot = sc.nextInt();
						
						switch (cot) {

						case 0:
							Construction(user);
							break;
							default:
								System.out.println("--Wrong Input--");
								Construction(user);
								break;
						}
			        }break;
		        
		        
			case 2:
				System.out.println("Enter the Name of the Cotton Gin Company");
				String projectName = sc.next();
				System.out.println("Enter the Initial Gin Capacity");
				int gincapacity = sc.nextInt();
				System.out.println("Enter the Total Income");
				double tIncome = sc.nextDouble();
				System.out.println("How Many Employee Need this Company");
				employee = sc.nextInt();
				
				while(isback) {
					System.out.println(""
							+ "\nPress 1: Add Gin Capacity \nPress 2: Update Total Income \nPress 3: Print Details \nPress 0: Back");
					int abcd = sc.nextInt();
					
					switch (abcd) {
					case 1:
						System.out.println("Enter the Gin Capacity");
						int capacity = sc.nextInt();
						gincapacity+=capacity;
						break;
					case 2:
						System.out.println("Enter the Income to Updat");
						double income = sc.nextDouble();
						tIncome+=income;
						break;
					case 3:
						print(user);
						System.out.println("Comepany Name       :"+projectName);
						System.out.println("Gin Capacity        :"+gincapacity);
						System.out.println("Total Income        :"+tIncome);
						System.out.println("Total Employees     :"+employee);
						break;
					case 0:
						Construction(user);
						break;
						default:
							System.out.println("--Wrong Input--");
							Construction(user);
							break;
					}
				}break;
			case 0:
				Construction(user);
				break;
				default:
					System.out.println("--Wrong Input--");
					Construction(user);
					break;
			}
		case 2:
			System.out.println("\n1.Types Of Oils "
					+ "\n0.Back");
			int cott1 = sc.nextInt();
			switch(cott1) {
			case 1:
				double totalWholesalePrice = 0, totalRetailPrice = 0;
		      
				System.out.println("Enter the Oil Name");
				name = sc.next();
				System.out.println("Enter the Quantity in Ltr:");
		        double weight = sc.nextDouble();
		        System.out.println("Enter the tax rate:");
		        double taxRate = sc.nextDouble();
		        

		        for (int i = 0; i < 2; i++) {
		            System.out.println("Enter the transaction type (1 - Wholesale, 2 - Retail):");
		            int transactionType = sc.nextInt();
		            System.out.println("Enter the price per kg:");
		            double price = sc.nextDouble();

		            double totalPrice = weight * price + weight * price * taxRate / 100;
		           
		            if (transactionType == 1) {
		                totalWholesalePrice += totalPrice;
		            } else if (transactionType == 2) {
		                totalRetailPrice += totalPrice;
		            } else {
		                System.out.println("Invalid transaction type. Please enter 1 or 2.");
		            }
		            print(user);
		            System.out.println("Oil Name            :"+name);
		            System.out.println("Oil Quantity        :"+weight);
		            System.out.println("Tax Rate            :"+taxRate);
		            System.out.println("Per Litre price     :"+price);
		            System.out.printf("Total wholesale price with tax : %.2f%n", totalWholesalePrice);
			        System.out.printf("Total retail price with tax    : %.2f%n", totalRetailPrice);
		        }
			        
			        while(isback) {
						System.out.println(""
								+ "\nPress 0: Back ");
						int cot = sc.nextInt();
						
						switch (cot) {

						case 0:
							Construction(user);
							break;
							default:
								System.out.println("--Wrong Input--");
								Construction(user);
								break;
						}
			        }break;
			case 0:
				Construction(user);
				break;
				default:
					System.out.println("--Wrong Input--");
					Construction(user);
					break;
			        
			}break;
			
		case 3:
			System.out.println("\n1.Types Of Masalas");
			int cott11 = sc.nextInt();
			switch(cott11) {
			case 1:
				double totalWholesalePrice = 0;
		        double totalRetailPrice = 0;
				System.out.println("Enter the Masala Name");
				name = sc.next();
				System.out.println("Enter the Quantity in Ltr:");
		        double weight = sc.nextDouble();
		        System.out.println("Enter the tax rate:");
		        double taxRate = sc.nextDouble();
		        

		        for (int i = 0; i < 2; i++) {
		            System.out.println("Enter the transaction type (1 - Wholesale, 2 - Retail):");
		            int transactionType = sc.nextInt();
		            System.out.println("Enter the price per kg:");
		            double price = sc.nextDouble();

		            double totalPrice = weight * price + weight * price * taxRate / 100;
		           
		            if (transactionType == 1) {
		                totalWholesalePrice += totalPrice;
		            } else if (transactionType == 2) {
		                totalRetailPrice += totalPrice;
		            } else {
		                System.out.println("Invalid transaction type. Please enter 1 or 2.");
		            }
		            print(user);
		            System.out.println("Masala Name         :"+name);
		            System.out.println("Masala Quantity     :"+weight);
		            System.out.println("Tax Rate            :"+taxRate);
		            System.out.println("Per Kg price        :"+price);
		            System.out.printf("Total wholesale price with tax : %.2f%n", totalWholesalePrice);
			        System.out.printf("Total retail price with tax    : %.2f%n", totalRetailPrice);
		        }
			        
			        while(isback) {
						System.out.println(""
								+ "\nPress 0: Back ");
						int cot = sc.nextInt();
						
						switch (cot) {

						case 0:
							Construction(user);
							break;
							default:
								System.out.println("--Wrong Input--");
								Construction(user);
								break;
						}
			        }break;
			case 0:
				Construction(user);
				break;
				default:
					System.out.println("--Wrong Input--");
					Construction(user);
					break;
			        
			}break;
		case 0:
			project(user);
			break;
			default:
				System.out.println("--Wrong Input--");
				Construction(user);
				break;
			
		}
	}
	
	public static void Farming(City3 user) {
		
		System.out.println("*Welcome to Farming on going projects*");
		System.out.println(""
				+ "\nPress 1: Commercial Farming "
				+ "\nPress 2: Plantation Farming "
				+ "\nPress 3: Mixed Farming "
				+ "\nPress 0: Back ");

		int on = sc.nextInt();
		
		int Quantity = 0, TotalQuantity = 0;
		byte land = 0;
		float TotalRate = 0f, gtax=0.05f, ptax=0.15f, rate = 0f;
		
		switch (on) {

		case 1:
			System.out.println("\nPress 1: Cotton "
					+ "\nPress 2: SugarCane "
					+ "\nPress 3: Groundnut "
					+ "\nPress 0: Back");
			String cott="Cotton";
			int com = sc.nextInt();
			switch(com) {
			case 1:
				System.out.println("How many productions");
				land = sc.nextByte();
				System.out.println("Total Quantity");
				Quantity = sc.nextInt();
				TotalQuantity=land*Quantity;
				break;
				
			case 2:
				System.out.println("How many productions");
				land = sc.nextByte();
				System.out.println("Total Quantity");
				Quantity = sc.nextInt();
				TotalQuantity=land*Quantity;
				break;
				
			case 3:
				System.out.println("How many productions");
				land = sc.nextByte();
				System.out.println("Total Quantity");
				Quantity = sc.nextInt();
				TotalQuantity=land*Quantity;
				break;
			}
				
			
				System.out.println("\nPress 1: Sales Government "
						+ "\nPress 2: Sales Private");
				String gvt="Govt.Sales";
				String pvt="PVT.Sales";
				int sales = sc.nextInt();
				switch(sales) {
				case 1:
					
					System.out.println("Government Tender Sales Rate Rs :");
					rate=sc.nextFloat();
					TotalRate = TotalQuantity*rate*gtax;
					
				
					while(isback) {
						System.out.println(""
								+ "\nPress 1: Print Details "
								+ "\nPress 0: Back ");
						int cot = sc.nextInt();
						
						switch (cot) {

						case 1:
							print(user);
							System.out.println("Sales Type          :" + gvt);
							System.out.println("Total Production    :" + land);
							System.out.println("Cotton Quantity	    :" + Quantity);
							System.out.println("Total C Quantity    :" + TotalQuantity);
							System.out.println("Govt.Cotton Tax%    :" + gtax);
							System.out.println("Govt.Cotton Rate    :" + rate);
							System.out.println("Cotton Total Amount :" + TotalRate);
							break;
							
						case 0:
							Farming(user);
							break;
							default:
								System.out.println("--Wrong Input--");
								Farming(user);
								break;
						}
					}break;
						
				case 2:
					
					System.out.println("Government Tender Sales Rate Rs :");
					rate=sc.nextFloat();
					TotalRate = (TotalQuantity*rate*ptax);
				
					while(isback) {
						System.out.println(""
								+ "\nPress 1: Print Details "
								+ "\nPress 0: Back ");
						int cot = sc.nextInt();
			
						switch (cot) {

						case 1:
							print(user);
							System.out.println("Sales Type          :" + pvt);
							System.out.println("Total Production    :" + land);
							System.out.println("Cotton Quantity	    :" + Quantity);
							System.out.println("Total C Quantity    :" + TotalQuantity);
							System.out.println("PVT.Cotton Tax%	    :" + ptax);
							System.out.println("PVT.Cotton Rate     :" + rate);
							System.out.println("Cotton Total Amount :" + TotalRate);
							break;
				
						case 0:
							Farming(user);
							break;
							default:
								System.out.println("--Wrong Input--");
								Farming(user);
								break;
						}
					}
				}
		
				break;
		case 2:
			System.out.println("\nPress 1: Tea Farming "
					+ "\nPress 2: Coffee Farming "
					+ "\nPress 3: Rubber Farming "
					+ "\nPress 0: Back");
			
			int plt = sc.nextInt();
			switch(plt) {
			case 1:
				System.out.println("How many productions");
				land = sc.nextByte();
				System.out.println("Total Quantity");
				Quantity = sc.nextInt();
				TotalQuantity=land*Quantity;
				break;
				
			case 2:
				System.out.println("How many productions");
				land = sc.nextByte();
				System.out.println("Total Quantity");
				Quantity = sc.nextInt();
				TotalQuantity=land*Quantity;
				break;
				
			case 3:
				System.out.println("How many productions");
				land = sc.nextByte();
				System.out.println("Total Quantity");
				Quantity = sc.nextInt();
				TotalQuantity=land*Quantity;
				break;
			}
				
			
				System.out.println("\nPress 1: Sales Government "
						+ "\nPress 2: Sales Private");
				String ab="Govt.Sales";
				String bc="PVT.Sales";
				int sale = sc.nextInt();
				switch(sale) {
				case 1:
					
					System.out.println("Government Tender Sales Rate Rs :");
					rate=sc.nextFloat();
					TotalRate = TotalQuantity*rate*gtax;
					
					while(isback) {
						System.out.println(""
								+ "\nPress 1: Print Details "
								+ "\nPress 0: Back ");
						int cot = sc.nextInt();
						
						switch (cot) {

						case 1:
							print(user);
							System.out.println("Sales Type          :" + ab);
							System.out.println("Total Production    :" + land);
							System.out.println("Cotton Quantity	    :" + Quantity);
							System.out.println("Total C Quantity    :" + TotalQuantity);
							System.out.println("Govt.Cotton Tax%    :" + gtax);
							System.out.println("Govt.Cotton Rate    :" + rate);
							System.out.println("Cotton Total Amount :" + TotalRate);
							break;
							
						case 0:
							Farming(user);
							break;
							default:
								System.out.println("--Wrong Input--");
								Farming(user);
								break;
						}
					}break;
						
				case 2:
					
					System.out.println("Government Tender Sales Rate Rs :");
					rate=sc.nextFloat();
					TotalRate = (TotalQuantity*rate*ptax);
				
					while(isback) {
						System.out.println(""
								+ "\nPress 1: Print Details "
								+ "\nPress 0: Back ");
						int cot = sc.nextInt();
			
						switch (cot) {

						case 1:
							print(user);
							System.out.println("Sales Type          :" + bc);
							System.out.println("Total Production    :" + land);
							System.out.println("Cotton Quantity	    :" + Quantity);
							System.out.println("Total C Quantity    :" + TotalQuantity);
							System.out.println("PVT.Cotton Tax%	    :" + ptax);
							System.out.println("PVT.Cotton Rate     :" + rate);
							System.out.println("Cotton Total Amount :" + TotalRate);
							break;
				
						case 0:
							Farming(user);
							break;
							default:
								System.out.println("--Wrong Input--");
								Farming(user);
								break;
						}
					}
				}
				break;
		case 3:
			System.out.println("\nPress 1: Banana Farming "
					+ "\nPress 2: Animal Farming "
					+ "\nPress 0: Back");
			
			int far = sc.nextInt();
			switch(far) {
			case 1:
				System.out.println("How many productions");
				land = sc.nextByte();
				System.out.println("Total Quantity");
				Quantity = sc.nextInt();
				TotalQuantity=land*Quantity;
				break;
				
			case 2:
				System.out.println("How many productions");
				land = sc.nextByte();
				System.out.println("Total Quantity");
				Quantity = sc.nextInt();
				TotalQuantity=land*Quantity;
				break;
			}
				
				System.out.println("\nPress 1: Sales Government "
						+ "\nPress 2: Sales Private");
				String cd="Govt.Sales";
				String de="PVT.Sales";
				int sal = sc.nextInt();
				switch(sal) {
				case 1:
					
					System.out.println("Government Tender Sales Rate Rs :");
					rate=sc.nextFloat();
					TotalRate = TotalQuantity*rate*gtax;
					
					while(isback) {
						System.out.println(""
								+ "\nPress 1: Print Details "
								+ "\nPress 0: Back ");
						int cot = sc.nextInt();
						
						switch (cot) {

						case 1:
							print(user);
							System.out.println("Sales Type          :" + cd);
							System.out.println("Total Production    :" + land);
							System.out.println("Cotton Quantity	    :" + Quantity);
							System.out.println("Total C Quantity    :" + TotalQuantity);
							System.out.println("Govt.Cotton Tax%    :" + gtax);
							System.out.println("Govt.Cotton Rate    :" + rate);
							System.out.println("Cotton Total Amount :" + TotalRate);
							break;
							
						case 0:
							Farming(user);
							break;
							default:
								System.out.println("--Wrong Input--");
								Farming(user);
								break;
						}
					}break;
						
				case 2:
					
					System.out.println("Government Tender Sales Rate Rs :");
					rate=sc.nextFloat();
					TotalRate = (TotalQuantity*rate*ptax);
				
					while(isback) {
						System.out.println(""
								+ "\nPress 1: Print Details "
								+ "\nPress 0: Back ");
						int cot = sc.nextInt();
			
						switch (cot) {

						case 1:
							print(user);
							System.out.println("Sales Type          :" + de);
							System.out.println("Total Production    :" + land);
							System.out.println("Cotton Quantity	    :" + Quantity);
							System.out.println("Total C Quantity    :" + TotalQuantity);
							System.out.println("PVT.Cotton Tax%	    :" + ptax);
							System.out.println("PVT.Cotton Rate     :" + rate);
							System.out.println("Cotton Total Amount :" + TotalRate);
							break;
				
						case 0:
							Farming(user);
							break;
							default:
								System.out.println("--Wrong Input--");
								Farming(user);
								break;
						}
					}
				}
				break;
		case 0:
			project(user);
			break;
			default:
				System.out.println("Wrong Input\n");
				Farming(user);
				break;
		}
	}
	
	public static void Road_Facilities(City3 user) {
	String street = "";
	System.out.println("*Welcome to Road Facilities on going projects*");
	System.out.println("Enter the Street");
	street=sc.next();
	System.out.println(""
			+ "\nPress 1: WBM Roads (Water Bond Machadem) "
			+ "\nPress 2: Gravel Roads "
			+ "\nPress 3: Concreate Roads"
			+ "\nPress 0: Back ");

	int on = sc.nextInt();

	int employee = 0, salary = 0, month_salary = 0, estimate = 0, days = 0, jally = 0, feet = 0, gravel_units = 9, gravel = 0, cement = 0;
	String type1 = "WBM Road (Water Bond Machadem)", type2 = "Gravel Roads", type3 = "Concreate Roads";
	
	switch (on) {

	case 1:
		System.out.println("How Many Feet Road Construction");
		feet = sc.nextInt();
		System.out.println("1 Berlan 63m cubic Jally 1 1/2inch size");
		jally = sc.nextInt();
		gravel = feet*gravel_units;
		System.out.println("How Many Employes Needed for this Project");
		employee = sc.nextInt();
		System.out.println("Salary for Employees per day");
		salary = sc.nextInt();
		System.out.println("No.of Days");
		days = sc.nextInt();
		month_salary = salary * days;
		System.out.println("Total Estimate cost of the project");
		estimate = sc.nextInt();
		
		while(isback) {
			System.out.println(""
					+ "\nPress 1: Print Details "
					+ "\nPress 0: Back ");
			int cot = sc.nextInt();
			
			switch (cot) {

			case 1:
				print(user);
				System.out.println("Street Name         :" + street);
				System.out.println("Road Type           :" + type1);
				System.out.println("Road Feet           :" + feet);
				System.out.println("Jally Qty    	    :" + jally);
				System.out.println("Gravel Qty          :" + gravel);
				System.out.println("Total Employees     :" + employee);
				System.out.println("Per Employee Salary :" + salary);
				System.out.println("Working Days        :" + days);
				System.out.println("per Monthly Salary  :" + month_salary);
				System.out.println("Project Estimate    :" + estimate);
				break;
				
			case 0:
				Road_Facilities(user);
				break;
				default:
					System.out.println("--Wrong Input--");
					Road_Facilities(user);
					break;
			}
		}break;

	case 2:
		System.out.println("How Many Feet Road Construction");
		feet = sc.nextInt();
		gravel = feet*gravel_units;
		System.out.println("How Many Employes Needed for this Project");
		employee = sc.nextInt();
		System.out.println("Salary for Employees per day");
		salary = sc.nextInt();
		System.out.println("No.of Days");
		days = sc.nextInt();
		month_salary = salary * days;
		System.out.println("Total Estimate cost of the project");
		estimate = sc.nextInt();
		
		while(isback) {
			System.out.println(""
					+ "\nPress 1: Print Details "
					+ "\nPress 0: Back ");
			int cot = sc.nextInt();
			
			switch (cot) {

			case 1:
				print(user);
				System.out.println("Street Name         :" + street);
				System.out.println("Road Type           :" + type2);
				System.out.println("Road Feet           :" + feet);
				System.out.println("Gravel Qty          :" + gravel);
				System.out.println("Total Employees     :" + employee);
				System.out.println("Per Employee Salary :" + salary);
				System.out.println("Working Days        :" + days);
				System.out.println("per Monthly Salary  :" + month_salary);
				System.out.println("Project Estimate    :" + estimate);
				break;
				
			case 0:
				Road_Facilities(user);
				break;
				default:
					System.out.println("--Wrong Input--");
					Road_Facilities(user);
					break;
			}
		}break;

	case 3:
		System.out.println("How Many Feet Road Construction");
		feet = sc.nextInt();
		System.out.println("1 Berlan 63m cubic Jally 1 1/2inch size");
		jally = sc.nextInt();
		System.out.println("How Many Cement bags use");
		cement = sc.nextInt();
		System.out.println("How Many Employes Needed for this Project");
		employee = sc.nextInt();
		System.out.println("Salary for Employees per day");
		salary = sc.nextInt();
		System.out.println("No.of Days");
		days = sc.nextInt();
		month_salary = salary * days;
		System.out.println("Total Estimate cost of the project");
		estimate = sc.nextInt();
		
		while(isback) {
			System.out.println(""
					+ "\nPress 1: Print Details "
					+ "\nPress 0: Back ");
			int cot = sc.nextInt();
			
			switch (cot) {

			case 1:
				print(user);
				System.out.println("Street Name         :" + street);
				System.out.println("Road Type           :" + type3);
				System.out.println("Road Feet           :" + feet);
				System.out.println("Gravel Qty          :" + gravel);
				System.out.println("Cement Qty          :" + cement);
				System.out.println("Total Employees     :" + employee);
				System.out.println("Per Employee Salary :" + salary);
				System.out.println("Working Days        :" + days);
				System.out.println("per Monthly Salary  :" + month_salary);
				System.out.println("Project Estimate    :" + estimate);
				break;
				
			case 0:
				Road_Facilities(user);
				break;
				default:
					System.out.println("--Wrong Input--");
					Road_Facilities(user);
					break;
			}
		}break;


	case 0:
		project(user);
		break;
		default:
			System.out.println("Wrong Input\n");
			Road_Facilities(user);
			break;
	}
	}
	
	public static void Water_Facilities(City3 user) {
	
	System.out.println("*Welcome to Water Facilities on going projects*");
	System.out.println(""
			+ "\nPress 1: Water Lorry "
			+ "\nPress 2: Water Towers"
			+ "\nPress 0: Back ");

	int on = sc.nextInt();
	
	int rate = 0, people = 0, div = 0, tankCapacity = 0, days = 0, towerCapacity = 30000, numOfTanks = 0, waterFlowRate = 300;
	double cap = 0, to = 0, go = 0, balance = 0;
	String strn1 = "";
	
			switch (on) {

			case 1:
				System.out.println("Water Lorry Tank Capacity");
				tankCapacity = sc.nextInt();
				System.out.println("\nWeek 1 \nWeek 2 \nWeek 3 \nWeek 4");
				int week = sc.nextInt();
				switch(week) {
				case 1:
					System.out.print("Street Name :");
					strn1 = sc.next();
					System.out.print("How Many Peoples Get the Water in this Street :");
					people = sc.nextInt();
					System.out.print("Pitcher capacity :");
					cap = sc.nextDouble();
					go = people*cap;
					if(tankCapacity<=go) {
						cap = tankCapacity/people;
						System.out.println("1 Person "+cap+" litre of water only");
						go = people*cap;
						balance = tankCapacity-go;
					}
					System.out.print("1 ltr Water Rate Rs :20\n");
					rate = 20;
					to = cap*rate;
					balance = tankCapacity-go;
			
					while(isback) {
						System.out.println(""
								+ "\nPress 1: Print Details "
								+ "\nPress 0: Back ");
						int mmm = sc.nextInt();
						
						switch (mmm) {

						case 1:
							print(user);
							System.out.println("Street Name 	    :" + strn1);
							System.out.println("No.of.People 	    :" + people);
							System.out.println("Lorrt Tank cap      :" + tankCapacity+" Litres");
							System.out.println("1 ltr per rate Rs   :" + rate);
							System.out.println("Pitcher Capacity    :" + cap+" Litres");
							System.out.println("Total ltr rate      :" + to);
							System.out.println("Water Available     :" + balance+" Litres");
							System.out.println("\n");
							break;
							
						case 0:
							Water_Facilities(user);
							break;
						}
					}break;
				case 2:
					System.out.print("Street Name :");
					strn1 = sc.next();
					System.out.print("How Many Peoples Get the Water in this Street :");
					people = sc.nextInt();
					System.out.print("Pitcher capacity :");
					cap = sc.nextDouble();
					go = people*cap;
					if(tankCapacity<=go) {
						cap = tankCapacity/people;
						System.out.println("1 Person "+cap+" litre of water only");
						go = people*cap;
						balance = tankCapacity-go;
					}
					System.out.print("1 ltr Water Rate Rs :25\n");
					rate = 25;
					to = cap*rate;
					balance = tankCapacity-go;
					
					while(isback) {
						System.out.println(""
								+ "\nPress 1: Print Details "
								+ "\nPress 0: Back ");
						int mmm = sc.nextInt();
						
						switch (mmm) {

						case 1:
							print(user);
							System.out.println("Street Name 	    :" + strn1);
							System.out.println("No.of.People 	    :" + people);
							System.out.println("Lorrt Tank cap      :" + tankCapacity+" Litres");
							System.out.println("1 ltr per rate Rs   :" + rate);
							System.out.println("Pitcher Capacity    :" + cap+" Litres");
							System.out.println("Total ltr rate      :" + to);
							System.out.println("Water Available     :" + balance+" Litres");
							System.out.println("\n");
							break;
							
						case 0:
							Water_Facilities(user);
							break;
						}
					}break;


				case 3:
					System.out.print("Street Name :");
					strn1 = sc.next();
					System.out.print("How Many Peoples Get the Water in this Street :");
					people = sc.nextInt();
					System.out.print("Pitcher capacity :");
					cap = sc.nextDouble();
					go = people*cap;
					if(tankCapacity<=go) {
						cap = tankCapacity/people;
						System.out.println("1 Person "+cap+" litre of water only");
						go = people*cap;
						balance = tankCapacity-go;
					}
					System.out.print("1 ltr Water Rate Rs :35\n");
					rate = 35;
					to = cap*rate;
					balance = tankCapacity-go;
					
					while(isback) {
						System.out.println(""
								+ "\nPress 1: Print Details "
								+ "\nPress 0: Back ");
						int mmm = sc.nextInt();
						
						switch (mmm) {

						case 1:
							print(user);
							System.out.println("Street Name 	    :" + strn1);
							System.out.println("No.of.People 	    :" + people);
							System.out.println("Lorrt Tank cap      :" + tankCapacity+" Litres");
							System.out.println("1 ltr per rate Rs   :" + rate);
							System.out.println("Pitcher Capacity    :" + cap+" Litres");
							System.out.println("Total ltr rate      :" + to);
							System.out.println("Water Available     :" + balance+" Litres");
							System.out.println("\n");
							break;
							
						case 0:
							Water_Facilities(user);
							break;
						}
					}break;
				case 4:
					System.out.print("Street Name :");
					strn1 = sc.next();
					System.out.print("How Many Peoples Get the Water in this Street :");
					people = sc.nextInt();
					System.out.print("Pitcher capacity :");
					cap = sc.nextDouble();
					go = people*cap;
					if(tankCapacity<=go) {
						cap = tankCapacity/people;
						System.out.println("1 Person "+cap+" litre of water only");
						go = people*cap;
						balance = tankCapacity-go;
					}
					System.out.print("1 ltr Water Rate Rs :50\n");
					rate = 50;
					to = cap*rate;
					balance = tankCapacity-go;
					
					while(isback) {
						System.out.println(""
								+ "\nPress 1: Print Details "
								+ "\nPress 0: Back ");
						int mmm = sc.nextInt();
						
						switch (mmm) {

						case 1:
							print(user);
							System.out.println("Street Name 	    :" + strn1);
							System.out.println("No.of.People 	    :" + people);
							System.out.println("Lorrt Tank cap      :" + tankCapacity+" Litres");
							System.out.println("1 ltr per rate Rs   :" + rate);
							System.out.println("Pitcher Capacity    :" + cap+" Litres");
							System.out.println("Total rate Rs       :" + to);
							System.out.println("Water Available     :" + balance+" Litres");
							System.out.println("\n");
							break;
							
						case 0:
							Water_Facilities(user);
							break;
						}
					}
				}break;
		
			case 2:
				System.out.println("Water Towers Tank Capacity 30000 Ltr");
				System.out.println("Enter the Villagge");
				String vil = sc.next();
				System.out.println("Enter the 4 Streets :");
				String s1 = sc.next(),s2 = sc.next(),s3 = sc.next(),s4 = sc.next();
				System.out.println("How Many Tanks in this Streets");
				numOfTanks = sc.nextInt();
				System.out.println("Enter the Tank Capacity");
				tankCapacity = sc.nextInt();
				
				int timeToFillAllTanks = (towerCapacity / waterFlowRate) * 60;
		        int totalCapacity = numOfTanks * tankCapacity;
		        int timeToDrainAllTanks = (totalCapacity / waterFlowRate) * 60;
		        balance = towerCapacity - totalCapacity;
		        LocalDateTime currentDateTime = LocalDateTime.now();
		        LocalDateTime openingDateTime = currentDateTime.plusSeconds(timeToFillAllTanks);
		        LocalDateTime closingDateTime = openingDateTime.plusSeconds(timeToDrainAllTanks);
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		        
		        while(isback) {
					System.out.println(""
							+ "\nPress 1: Print Details "
							+ "\nPress 0: Back ");
					int mmm = sc.nextInt();
					
					switch (mmm) {

					case 1:
						print(user);
						System.out.println("Village Name 	    :" + vil);
						System.out.println("Street Name         :" + s1+", "+s2+", "+s3+", "+s4);
						System.out.println("Water Tower Cap     :" + towerCapacity+" Litres");
						System.out.println("Water Flow Rate     :" + waterFlowRate+" Litres per Minutes");
						System.out.println("No.of Tanks         :" + numOfTanks);
						System.out.println("Tanks Capacity      :" + tankCapacity+" Litres");
						System.out.println("Water tower opening date and time: " + openingDateTime.format(formatter));
				        System.out.println("Water tower closing date and time: " + closingDateTime.format(formatter));
						System.out.println("Drain ALL Tanks     :" + timeToDrainAllTanks+"s");
						System.out.println("Water Tower Balance :" + balance);
						System.out.println("\n");
						break;
						
					case 0:
						Water_Facilities(user);
						break;
					}
		        }break;
		         
			case 0:
				project(user);
				break;
				default:
					System.out.println("--Wrong Input--");
					Water_Facilities(user);
					break;
			}
	}
       
	public static void Childrens_Park(City3 user) {
	
	System.out.println("*Welcome to Childrens Park on going projects*");
	System.out.println(""
			+ "\nPress 1: Adventure Park "
			+ "\nPress 2: Gym"
			+ "\nPress 0: Back ");

	int on = sc.nextInt();
	
	double distance = 0, totalRevenue = 0, bookingPrice = 0, bookingPrice2 = 0, bookingPrice3 = 0, bookingPrice4 = 0, bookingPrice5 = 0, latitude1 = 0, longitude1 = 0, earthRadius = 6371, dLat = 0, dLng = 0, a = 0, c = 0, totalRevenue2 = 0, totalRevenue1 = 0, latitude2 = 11.3265, longitude2 = 76.9127, latitude3 = 12.835777, longitude3 = 77.401976;
	
	int adultBookings = 0, childBookings = 0, studentBookings = 0, totalBookings = 0, dryGamesBookings = 0, waterGamesBookings = 0;
    
	String dryGames = "Dry Games", waterGames = "Water Games", wel ="", vlg = "", park1 = "BlackThunder";
    
	switch (on) {

	case 1:
		System.out.println("\nPress 1: BlackThunder "
				+ "\nPress 2: Wounderla");
		int park = sc.nextInt();
		switch(park) {
		case 1:
			
			System.out.println("Enter the your Village Name");
			vlg = sc.next();
			System.out.println("Enter the latitude1: ");
	        latitude1 = sc.nextDouble();

	        System.out.println("Enter the longitude1: ");
	        longitude1 = sc.nextDouble();
	        
	        dLat = Math.toRadians(latitude2 - latitude1);
	        dLng = Math.toRadians(longitude2 - longitude1);
	        a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
	                   Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2)) *
	                   Math.sin(dLng / 2) * Math.sin(dLng / 2);
	        c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
	        distance = earthRadius * c;
	        
		        System.out.println("Welcome to BlackThunder");
		        System.out.println("Enter the number of Persons bookings:");

		        totalBookings = sc.nextInt();
		        

		        for (int i = 0; i < totalBookings; i++) {
		            System.out.println("Enter 1 for Adult Ticket, "
		            		+ "2 for Child Ticket, "
		            		+ "3 for Student Ticket:");
		            int bookingType = sc.nextInt();

		            if (bookingType == 1 || bookingType == 2 || bookingType == 3) {

		                if (bookingType == 1) {
		                	System.out.println("Enter the booking price:");
			                bookingPrice = sc.nextDouble();
			                totalRevenue2 += bookingPrice;
		                    adultBookings++;
		                } else if (bookingType == 2) {
		                	System.out.println("Enter the booking price:");
			                bookingPrice2 = sc.nextDouble();
			                totalRevenue2 += bookingPrice;
		                    childBookings++;
		                } else if (bookingType == 3) {
		                	System.out.println("Enter the booking price:");
			                bookingPrice3 = sc.nextDouble();
			                totalRevenue2 += bookingPrice;
		                    studentBookings++;
		                }
		            } else {
		                System.out.println("Invalid option, try again.");
		                i--;
		            }
		        }
		
		       
		 		System.out.println("Welcome to the Adventure Theme Park");
		 		wel = "Adventure Theme park";
		 		System.out.println("Enter the No.of Games bookings:");

		 		totalBookings = sc.nextInt();
		 
		 		for (int i = 0; i < totalBookings; i++) {
	            System.out.println("Enter 1 for Dry Games Ticket, "
	            		+ "2 for Water Games Ticket:");
	            int bookingType = sc.nextInt();

	            if (bookingType == 1 || bookingType == 2) {

	                if (bookingType == 1) {
	                	System.out.println("Enter the booking price:");
		                bookingPrice4 = sc.nextDouble();
		                totalRevenue2 += bookingPrice;
	                    dryGamesBookings++;
	                } else if (bookingType == 2) {
	                	System.out.println("Enter the booking price:");
		                bookingPrice5 = sc.nextDouble();
		                totalRevenue2 += bookingPrice;
	                    waterGamesBookings++;
	                }
	            } else {
	                System.out.println("Invalid option, try again.");
	                i--;
	            }
	        }
		 		while(isback) {
					System.out.println(""
							+ "\nPress 1: Print Details "
							+ "\nPress 0: Back ");
					int mmm = sc.nextInt();
					
					switch (mmm) {

					case 1:
						print(user);
						System.out.println("Village Name 	    :" + vlg);
						System.out.println("Total Distance      :" + distance + " kilometers");
						System.out.println("-----------------------------------------------------------\n");
						System.out.println("Enterance Booking");
						System.out.println("Adventure Park      :" + park1);
						System.out.println("Number of Adult     :" + adultBookings+" ("+bookingPrice+" Rs.)");
				        System.out.println("Number of Child     :" + childBookings+" ("+bookingPrice2+" Rs.)");
				        System.out.println("Number of Student   :" + studentBookings+" ("+bookingPrice3+" Rs.)");
				        System.out.println("Total Revenue       :" + totalRevenue1);
						System.out.println("-----------------------------------------------------------\n");
						System.out.println("Games Booking");
						System.out.println("Dry Games"+" - "+"Water Games");
						System.out.println("    "+dryGamesBookings+"     -     "+waterGamesBookings+"    ");
						System.out.println(" Rs."+bookingPrice4+"  -    Rs."+bookingPrice5+"    ");
						
						System.out.println("Total Revenue    :"+totalRevenue2);
						break;
						
					case 0:
						Water_Facilities(user);
						break;
					}
		        }break;
		case 2:
			
			System.out.println("Enter the your Village Name");
			vlg = sc.next();
			System.out.println("Enter the latitude1: ");
	        latitude1 = sc.nextDouble();

	        System.out.println("Enter the longitude1: ");
	        longitude1 = sc.nextDouble();

	        dLat = Math.toRadians(latitude3 - latitude1);
	        dLng = Math.toRadians(longitude3 - longitude1);
	        a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
	                   Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude3)) *
	                   Math.sin(dLng / 2) * Math.sin(dLng / 2);
	        c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
	        distance = earthRadius * c;
	        
		        System.out.println("Welcome to WounderLa");
		        System.out.println("Enter the number of Persons bookings:");

		        totalBookings = sc.nextInt();
		        

		        for (int i = 0; i < totalBookings; i++) {
		            System.out.println("Enter 1 for Adult Ticket, "
		            		+ "2 for Child Ticket, "
		            		+ "3 for Student Ticket:");
		            int bookingType = sc.nextInt();

		            if (bookingType == 1 || bookingType == 2 || bookingType == 3) {

		                if (bookingType == 1) {
		                	System.out.println("Enter the booking price:");
			                bookingPrice = sc.nextDouble();
			                totalRevenue1 += bookingPrice;
		                    adultBookings++;
		                } else if (bookingType == 2) {
		                	System.out.println("Enter the booking price:");
			                bookingPrice2 = sc.nextDouble();
			                totalRevenue1 += bookingPrice;
		                    childBookings++;
		                } else if (bookingType == 3) {
		                	System.out.println("Enter the booking price:");
			                bookingPrice3 = sc.nextDouble();
			                totalRevenue1 += bookingPrice;
		                    studentBookings++;
		                }
		            } else {
		                System.out.println("Invalid option, try again.");
		                i--;
		            }
		        }
		
		       
		 		System.out.println("Welcome to the Adventure Theme Park");
		 		wel = "Adventure Theme park";
		 		System.out.println("Enter the No.of Games bookings:");

		 		totalBookings = sc.nextInt();
		 		
		 		totalRevenue1 = 0;

		 		for (int i = 0; i < totalBookings; i++) {
	            System.out.println("Enter 1 for Dry Games Ticket, "
	            		+ "2 for Water Games Ticket:");
	            int bookingType = sc.nextInt();

	            if (bookingType == 1 || bookingType == 2) {

	                if (bookingType == 1) {
	                	System.out.println("Enter the booking price:");
		                bookingPrice4 = sc.nextDouble();
		                totalRevenue1 += bookingPrice;
	                    dryGamesBookings++;
	                } else if (bookingType == 2) {
	                	System.out.println("Enter the booking price:");
		                bookingPrice5 = sc.nextDouble();
		                totalRevenue1 += bookingPrice;
	                    waterGamesBookings++;
	                }
	            } else {
	                System.out.println("Invalid option, try again.");
	                i--;
	            }
	        }

		 		while(isback) {
					System.out.println(""
							+ "\nPress 1: Print Details "
							+ "\nPress 0: Back ");
					int mmm = sc.nextInt();
					
					switch (mmm) {

					case 1:
						print(user);
						System.out.println("Village Name 	    :" + vlg);
						System.out.println("Total Distance      :" + distance + " kilometers");
						System.out.println("-----------------------------------------------------------\n");
						System.out.println("Enterance Booking");
						System.out.println("Adventure Park      :" + park1);
						System.out.println("Number of Adult     :" + adultBookings+" ("+bookingPrice+" Rs.)");
				        System.out.println("Number of Child     :" + childBookings+" ("+bookingPrice2+" Rs.)");
				        System.out.println("Number of Student   :" + studentBookings+" ("+bookingPrice3+" Rs.)");
				        System.out.println("Total Revenue       :" + totalRevenue1);
						System.out.println("-----------------------------------------------------------\n");
						System.out.println("Games Booking");
						System.out.println("Dry Games"+" - "+"Water Games");
						System.out.println("    "+dryGamesBookings+"     -     "+waterGamesBookings+"    ");
						System.out.println(" Rs."+bookingPrice4+"  -    Rs."+bookingPrice5+"    ");
						
						System.out.println("Total Revenue    :"+totalRevenue1);
						break;
						
					case 0:
						Childrens_Park(user);
						break;
					}
		        }break;
		}break;
		double NexusgymLat = 10.999999;
        double NexusgymLong = 77.280930;
        double currentLat = 10.994670;
        double currentLong = 77.288490;

        double distance1 = calculateDistance(NexusgymLat, NexusgymLong, currentLat, currentLong);
        System.out.println("Distance to Nexusgym: " + distance1 + " kilometers");

        double MenPrice = 2500.00; 
        double WomenPrice = 1800.00; 

      
        List<String> facilities = Arrays.asList("SPIRIT Cardio Equipment offers various training programs to get the maximum out of every sportsman", "SPIRIT strength equipment is the foundation for any full-service fitness facility", "Group training is a popular way to exercise and a great way to keep your members motivated");

  
        System.out.println("\nNexus Gym Details:");
        System.out.println("Men Price for 1 Month: RS " + MenPrice);
        System.out.println("Women Price for 1 month: RS " + WomenPrice);
        System.out.println("Facilities:");
        for (String facility : facilities) {
            System.out.println("- " + facility);
        }
    }}

   
    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double R = 6371; 
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c;
    }
}

	case 0:
		project(user);
		break;
		default:
			System.out.println("--Wrong Input--");
			Childrens_Park(user);
			break;
			
	}
	}
		
	public static void main(String args[]) {
		City3 user = new City3("Uniq", "1234");
		City3.uniq(user);
	}

	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return Password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		Password = password;
	}
}
