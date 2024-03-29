package smartCity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Ten{
	String name;
	public int namet;
	Ten(String name)
	{
		this.name=name;
	
}
public String toString() {
	return name;
}
}
class Ten2 implements  Comparator<Ten>{

@Override
public int compare(Ten o1, Ten o2) {
	// TODO Auto-generated method stub
	int d=o1.name.compareTo(o2.name);
if(d<1)
	return 1;
if(d>1)
	return -1;
else
	return 0;
}
public class Rad implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Ten n1=(Ten)o1;
		Ten2 n2=(Ten)o2;
		if(n1.length<n2.length)
			return 1;
		if(n1.length>n2.length)
			return -1;
		else 
		return 0;
	
}
public static void main(String aargs[]) {
	ArrayList d1=new ArrayList<>();
	d1.add()
}