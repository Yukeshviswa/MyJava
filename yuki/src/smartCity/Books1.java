package smartCity;
import java.util.ArrayList;
import java.util.Collections;

public class Books1 implements Comparable<Books1> {
String title;
String author;
Integer publicationyear;
Books1(String title,String author,Integer publicationyear){  //comparable to acending order
	this.title=title;
	this.author=author;
	this.publicationyear=publicationyear;
}

public int compareTo(Books1 o) {
	// TODO Auto-generated method stub
	Books1 a=(Books1)o;
	Integer b=a.publicationyear.compareTo(publicationyear);
	if(b>1) {
		return 1;}
	if(b<1) {
		return -1;}

	return 0;
}
public String toString() {
	return (title+" "+author+" "+publicationyear);

}
public static void main(String args[]) {
	ArrayList al=new ArrayList<>();
	al.add(new Books1("Rich dad Poor dad","kiyosaki",1997));
	al.add(new Books1("Think like Monk","jay shetty",2020));
	al.add(new Books1("psychology of money","kiyosaki",2019));
	Collections.sort(al);
	System.out.println(al);
}

}
