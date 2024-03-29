package sample1;
import java.util.ArrayList;
import java.util.Collections;


public class Students11 implements Comparable<Students11> {
	String studentname;
	Integer studentage;
	Float studentgpa;
	Students11(String studentname,Integer studentage,Float studentgpa){
		this.studentname=studentname;
		this.studentage=studentage;
		this.studentgpa=studentgpa;
	}
	@Override
	public int compareTo(Students11 o) {
		// TODO Auto-generated method stub
		Students11 a=(Students11)o;
		Integer b=a.studentgpa.compareTo(studentgpa);
		if(b<1) {
			return 1;}
		if(b>1) {
			return -1;}

		return 0;
	}
	public String toString() {
		return (studentname+" "+studentage+" "+studentgpa);
	
	}
	public static void main(String args[]) {
		ArrayList al=new ArrayList<>();
		al.add(new Students11("Ram",17,8.5f));
		al.add(new Students11("Ravik",19,7.6f));
		al.add(new Students11("Raja",15,9.2f));
		Collections.sort(al);
		System.out.println(al);
	}

	}
