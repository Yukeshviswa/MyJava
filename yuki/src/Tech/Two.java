package Tech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Three 
{
	Integer id;
	String name;
	String job;
	Integer salary;

	Three(Integer id,String name,String job,Integer salary)   //Its a Comparator program in Collections
	{
		this.id=id;
		this.name=name;
		this.job=job;
		this.salary=salary;
		
	}
	
	
	public String toString() {
		return id+" "+name+" "+job+ " "+salary;
	}

}
class Four implements Comparator<Three>
{

	
	public int compare(Three o1, Three o2) {
		int d=o1.name.compareTo(o2.name);
		if(d<1)
			return 1;
		else if(d>1)
			return -1;
		return 0;
	}
	
}
public class Two implements Comparator
 {
	
	public int compare(Object o1, Object o2) {
		Three t=(Three)o1;
		Three t1=(Three)o2;
		if(t.salary<t1.salary)
			return 1;
		if(t.salary>t1.salary)
			return -1;
		return 0;
	}
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(new Three(2,"Kattupoochi"," Data Analist",500000));
		al.add(new Three(1,"Dilli","Developer",100000));
		al.add(new Three(4,"Rolex","AI",300000));
	    Collections.sort(al,new Two());
	    System.out.println(al);
	    Collections.sort(al,new Four());
	    System.out.println(al);
	}

}