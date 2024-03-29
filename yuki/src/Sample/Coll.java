package Sample;

import java.util.*;

public class Coll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating and Adding Elements
		TreeSet<String> set=new TreeSet<String>();
		set.add("Akash");
		set.add("Kiran");
		set.add("Aravind");
		set.add("Yuki");
		//traversing Elements
		Iterator <String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
