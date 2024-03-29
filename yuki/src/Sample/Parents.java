package Sample;

public class Parents {
int a;
void display() {
	System.out.println("Parents");
}
	class Child extends Parents{
		int b;
		void show() {
			System.out.println("Child");
		
		}
	}
	public class Parentsdemo{
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Child c=new Child();
c.b=10;
c.a=10;
System.out.println(c.a);
System.out.println(c.b);
c.display();
c.show();

	}

}
