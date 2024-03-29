package Sample;
class Student{
	String name;
	int Rank;

void display() {
	System.out.println("Name:"+name);
}
}
public class Yuki30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student();
Student s2=new Student();
s1.name="kiran";
s2.name="Akash";
s1.Rank=10;
s2.Rank=8;
s1.display();
s2.display();
	}

}
