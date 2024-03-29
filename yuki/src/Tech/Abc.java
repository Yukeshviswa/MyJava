package Tech;
import java.util.ArrayList;
import java.util.Collections;
public class Abc implements Comparable<Abc> {
Integer id;
String name;
String job;
Integer salary;
Abc(Integer id,String name,String job,Integer salary){   // Its a Comparable program in Collections
	this.id=id;
	this.name=name;
	this.job=job;
	this.salary=salary;
	
}
public int compareTo(Abc  o) {
	
	Integer b=o.name.compareTo(name);
if(b<1)
	return 1;
if(b>1)
	return -1;
else
	return 0;

}
public String toString() {
	return id+" "+name+" "+job+" "+salary;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList<>();
al.add(new Abc(3,"Raki","TL",40000));
al.add(new Abc(2,"Ram","TL",25000));
al.add(new Abc(4,"Randy","TL",30000));
Collections.sort(al);
System.out.println(al);
	}
}
