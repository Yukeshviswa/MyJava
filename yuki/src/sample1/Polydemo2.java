package sample1;
class Parents2{
	void show() {
		System.out.println("Hello Parent");
	}
}
class Child2 extends Parents2 {
	void show() {
		System.out.println("Hello Child");
	}
}
                              //RunTime Polymorphism---Method Overriding 
public class Polydemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child2 c2=new Child2();
c2.show();

	}

}
