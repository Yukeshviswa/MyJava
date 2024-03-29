package sample1;
class Detail1{
	private int age=22;
	public int setAge;

	public int getAge() {
		return age;
	}

	public void setAge(int val) {
		System.out.println("Changed age:"+val);   //Encapsulation///Bindina a data members and methods into a single Entity
		age = val;
	}
}




public class Encapdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Detail1 de=new Detail1();
de.setAge(30);
System.out.println(de.getAge());
	}

}
