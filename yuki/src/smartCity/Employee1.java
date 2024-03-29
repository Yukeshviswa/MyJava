package smartCity;
import java.util.ArrayList;
import java.util.Collections;


public class Employee1 implements Comparable<Employee1> {
	
	Integer id;
	String Employeename;
	long salary;
	Employee1(Integer id,String Employeename,long salary){
		this.id=id;
		this.Employeename=Employeename;
		this.salary=salary;
		
	}
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		Employee1 a=(Employee1)o;
		Integer b=a.id.compareTo(id);
		if(b<1) {
			return 1;}
		if(b>1) {
			return -1;}

		return 0;
	}
	public String toString() {
		return (id+" "+Employeename+" "+salary);
	
	}
	public static void main(String args[]) {
		ArrayList al=new ArrayList<>();
		al.add(new Employee1(10,"yuki",120000l));
		al.add(new Employee1(12,"kiran",90000l));
		al.add(new Employee1(13,"akash",110000l));
		Collections.sort(al);
		System.out.println(al);
	
	}

	}
