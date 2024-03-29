package Lambda;
import java.util.ArrayList;
import java.util.List;

public class EmployeeStream {
	String name;
	double Salary;
	String dept;
	int exp;
	EmployeeStream(String name, double Salary, String dept, int exp){
		this.name = name;
		this.Salary = Salary;
		this.dept = dept;
		this.exp = exp;
	}
	 public double getSalary() {
			return Salary;
		}
		public void setSalary(double salary) {
			this.Salary = salary;
		}
		public String toString() {
			return name+" "+Salary;
		}



//	public class EmployeeStreamExample {

	   
		public static void main(String[] args) {
	        List<EmployeeStream> employees = new ArrayList<>();
	        employees.add(new EmployeeStream("Yuki", 55000, "Developer", 5));
	        employees.add(new EmployeeStream("JackDaniel", 50000, "Manager", 3));
	        employees.add(new EmployeeStream("BobMerly", 45000, "Tester", 2));

	        System.out.println("Before Salary Increment:");
	        employees.forEach(System.out::println);

	        // Increase salary by 10% for employees with more than 3 years of experience
	        incrementSalary(employees);

	        System.out.println("\nAfter Salary Increment:");
	        employees.forEach(System.out::println);
	    }

	    private static void incrementSalary(List<EmployeeStream> employees) {
	        employees.parallelStream()
	                .filter(emp -> emp.exp > 4)
	                .forEach(emp -> emp.setSalary(emp.getSalary() +5000.0));
	    }

	}