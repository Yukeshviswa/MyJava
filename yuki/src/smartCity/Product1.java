package smartCity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Three 
{
	
	String productname;
	Integer price;
	Integer quantity;
	Three(String productname,Integer price,Integer quantity)
	{
		
		this.productname=productname;
		this.price=price;
		this.quantity=quantity;
		
	}
	
	@Override
	public String toString() {
		return (productname+" "+price+ " "+quantity);
	}

}
class Four implements Comparator<Three>
{

	@Override
	public int compare(Three o1, Three o2) {
		// TODO Auto-generated method stub
		int d=o1.price.compareTo(o2.price);
		if(d>1)
			return 1;
		else if(d<1)
			return -1;
		return 0;
	}
	
}
public class Product1 implements Comparator
 {
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Three t=(Three)o1;
		Three t1=(Three)o2;
		if(t.price>t1.price)
			return 1;
		if(t.price<t1.price)
			return -1;
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList<>();
		al.add(new Three("Dell",45000,100));
		al.add(new Three("Asusz",65000,250));
		al.add(new Three("Lenova",38000,80));
	    Collections.sort(al,new Product1());
	    System.out.println(al);
	    Collections.sort(al,new Four());
	    System.out.println(al);
	}

}