package Sample;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> lit1=new ArrayList<String>();
lit1.add("Mango");
lit1.add("Apple");
lit1.add("Betroot");
lit1.add("Pineaple");
//System.out.println("Reterving Element:"+lit1.get(1) );
Collections.sort(lit1);  
//lit1.set(1,"Carrot");
for(String fruit:lit1)
System.out.println(fruit);
System.out.println("Sorting Numbers...");
List<Integer> lit2=new ArrayList<Integer>();
lit2.add(21);
lit2.add(31);
lit2.add(41);
lit2.add(50);
Collections.sort(lit2);
for(Integer number:lit2)
	System.out.println(number);
	}

}
