package smartCity;

public class Stud  {

	String name;
	int age;
	static String teacher;
	
	void display(){
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		System.out.println("Teacher name = " + teacher);
	}

static {
	Stud.teacher="Ravi";
}
}
public class Youtube1{
	public static void main(String args[]) {
		Stud s1=new Stud();
		Stud s2=new Stud();
s1.name="Yuki";
s1.age=24;
s2.name="Viki";
s2.age=23;
s1.display();
s2.display();
	}
}
