package sample1;
class Yuki{
	int num1;
	int num2;
	int result;
	void sum(int a,int b) {
		num1=a;
		num2=b;
		result=num1+num2;
		System.out.println(result);
	}                                //Compile time Polymorphism---Method OverLoading
void sum(double a,double b) {
	num1=(int)a;
	num2=(int)b;
	result=num1+num2;
	System.out.println(result);
}
void sum(int a,double b) {
	num1=a;
	num2=(int)b;
	result=num1+num2;
	System.out.println(result);
}
}

public class Polydemo1 {

	public static void main(String[] args) {
		Yuki yuk=new Yuki();
		yuk.sum(10,20);
		yuk.sum(10.2, 11.5);
		yuk.sum(15, 16.5);
		// TODO Auto-generated method stub

	}

}
