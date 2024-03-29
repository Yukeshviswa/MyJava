package Sample;

class Parents111 {    
int a;
void display() {
	System.out.println("Parents1");
}
}
	class Child extends Parents111{
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
c.a=100;
System.out.println(c.a);
System.out.println(c.b);
c.display();
c.show();

	}
}