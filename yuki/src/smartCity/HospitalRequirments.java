package smartCity;
import java.util.*;

class Doctor {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }
}

class Patient {
    private String name;
    private int id;
    private String mobileNumber;

    public Patient(String name, int id, String mobileNumber) {
        this.name = name;
        this.id = id;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}

class Pharmacy {
    public void dispenseMedicine(String doctorName, String patientName, String medicine) {
        System.out.println("Doctor: " + doctorName + " has prescribed " + medicine + " for patient: " + patientName);
        System.out.println("Medicine dispensed: " + medicine);
        System.out.println("Patient " + patientName + " can proceed to payment.");
    }
}

public class HospitalRequirments{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Dr. Smith", "Cardiologist"));
        doctors.add(new Doctor("Dr. Johnson", "Neurologist"));
        
        
        System.out.println("Welcome to Hospital XYZ!");
        System.out.println("Please enter your name: ");
        String patientName = scanner.nextLine();
        System.out.println("Enter your patient ID: ");
        int patientId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter your mobile number: ");
        String patientMobileNumber = scanner.nextLine();
        
        System.out.println("Enter your issue to find a suitable doctor:");
        String patientIssue = scanner.nextLine();

        Doctor assignedDoctor = findDoctor(patientIssue, doctors);
        if (assignedDoctor != null) {
            System.out.println("Doctor assigned to you: " + assignedDoctor.getName() +
                    " (" + assignedDoctor.getSpecialization() + ")");
            System.out.println("Consultation with " + assignedDoctor.getName() + " in progress...");
            System.out.println("Please wait for your prescription.");
            
          
            Pharmacy pharmacy = new Pharmacy();
            pharmacy.dispenseMedicine(assignedDoctor.getName(), patientName, "Paracetamol");
            
        } else {
            System.out.println("Sorry, no suitable doctor found for your issue at the moment.");
        }
    }

    private static Doctor findDoctor(String issue, List<Doctor> doctors) {
        for (Doctor doctor : doctors) {
            if (doctor.getSpecialization().equalsIgnoreCase(issue)) {
                return doctor;
            }
        }
        return null;
    }
}

//import java.util.Scanner;
//public class HospitalRequirments {
//
//
//
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        while (true) {
//	            System.out.println("Welcome to the psg Hospital !");
//	            System.out.println("1. Hospital Facilities");
//	            System.out.println("2. Patient Information");
//	            System.out.println("3. Surgery Options");
//	            System.out.println("0. Exit");
//	            System.out.print("Enter your choice: ");
//
//	            int choice = scanner.nextInt();
//
//	            switch (choice) {
//	                case 1:
//	                    hospitalFacilities();
//	                    break;
//	                case 2:
//	                    patientInformation();
//	                    break;
//	                case 3:
//	                    surgeryOptions();
//	                    break;
//	                case 0:
//	                    System.out.println("Exiting... Thank you!");
//	                    System.exit(0);
//	                default:
//	                    System.out.println("Invalid choice. Please enter a valid option.");
//	            }
//	        }
//	    }
//
//	    public static void hospitalFacilities() {
//	        System.out.println("Hospital Facilities:");
//	        System.out.println("- Available beds: 300");
//	        System.out.println("- Intensive Care Units: 20");
//	        System.out.println("- Emergency Room Services: Available 24/7");
//	        System.out.println("- Diagnostic Center: MRI, X-Ray, CT Scan");
//	        System.out.println("- Operating Rooms: 10");
//	 
//	    }
//
//	    public static void patientInformation() {
//	        System.out.println("Patient Information:");
//	        System.out.println("- Total Patients Admitted: 150");
//	        System.out.println("- Average Length of Stay: 5 days");
//	        System.out.println("- Outpatient Visits: 500 per week");
//	       
//	    }
//
//	    public static void surgeryOptions() {
//	        System.out.println("Surgery Options:");
//	        System.out.println("- General Surgery");
//	        System.out.println("- Orthopedic Surgery");
//	        System.out.println("- Neurosurgery");
//	        System.out.println("- Cardiothoracic Surgery");
//	  
//	    }
//	}
