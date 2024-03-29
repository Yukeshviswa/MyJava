package Sample;
class grandparent{
	int g;
	void display() {
		System.out.println("Grantparent");
	}
}
class parent extends grandparent{
	int p;
	void show() {
		System.out.println("Parent");
	}
}
class child extends parent{
	int c;
	void print() {                           //Multilevel Inheritance..
		System.out.println("Child");
	}
}


public class Multilevel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child c=new child();
c.g=30;
c.p=20;
c.c=10;
System.out.println(c.g);
System.out.println(c.p);
System.out.println(c.c);
c.display();
c.show();
c.print();


	}

}
