package smartCity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Num1{
	String personname;
	Integer age;
	Integer height;
	Num1(String personname,Integer age,Integer height){
		this.personname=personname;
		this.age=age;
		this.height=height;
		
	}
	public String toString() {
		return(personname+" "+age+" "+height);
	}
}
class Num2 implements Comparator<Num1>
{

@Override
public int compare(Num1 o1, Num1 o2) {
	// TODO Auto-generated method stub
	int d=o1.height.compareTo(o2.height);
	if(d<1) 
		return 1;
	if(d>1)
		return -1;
	else
	return 0;
}

}
public class Person1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Num1 n1=(Num1)o1;
		Num1 n2=(Num1)o2;
		if(n1.height<n2.height)
			return 1;
		if(n1.height>n2.height)
			return -1;
		else 
		return 0;
	}
	
public static void main(String args[]) {
	ArrayList a1=new ArrayList<>();
	a1.add(new Num1("Roky",25,170));
	a1.add(new Num1("Yuki",23,169));
	a1.add(new Num1("Jenifer",21,160));
Collections.sort(a1,new Person1());
System.out.println(a1);
Collections.sort(a1,new Num2());
System.out.println(a1);
}
}


