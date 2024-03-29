package sample1;

class ABC{
	void display() {
		System.out.println("ABC");
	}
}
class C1 extends ABC{
	void show1() {
		System.out.println("Child 1");
	}
}
class C2 extends ABC{
	void show2() {
		System.out.println("Child 2");
	}
}

public class Hirachal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C1 obj=new C1();
C2 obj1=new C2();
obj.show1();
obj.display();
	obj1.show2();
	obj1.display();
	
	}
	

}
