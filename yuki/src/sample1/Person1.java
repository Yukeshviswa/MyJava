package sample1;
abstract class People1{
	abstract void eat();
	}
public class Person1 {
public static void main(String args[]) {
	People1 sc=new People1() {
			void eat() {
		System.out.println("Nice Fruite");}
	};
sc.eat();
}
}
