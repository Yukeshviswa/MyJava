package sample1;

class TestOuter11{
	private int data=30;
	class Inner1{
		void msg() {
			System.out.println("data is:" +data);}
		}
		public static void main(String args[]) {
			TestOuter11 obj=new TestOuter11();
			TestOuter11.Inner1 in=obj.new Inner1();
			in.msg();
	}
	

}
