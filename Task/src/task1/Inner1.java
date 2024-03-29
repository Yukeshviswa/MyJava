package task1;

public class Inner1{
	private int data=50;

class TestmemberOuter1{
	void msg() {
	System.out.println("the data is:"+ data);
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Inner1 obj=new Inner1();
Inner1.TestmemberOuter1 in=obj.new TestmemberOuter1();
in.msg();
	}


}