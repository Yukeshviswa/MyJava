package sample1;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a=30;
//int b=20;
//if(a<b) {
//	System.out.println("A is greater than b... ");
//}
//else {
//	System.out.println("A is not greater than b...");
//}
//		int age=23;
//		if(age>=18) {
//			System.out.println("You are Eligible for vote");
//		}
//		else {
//			System.out.println("You are not Eligible for vote");
//		}
//	int num=9;
//	if(num%2==0) {
//		System.out.println("Even number");
//	}
//	else {
//		System.out.println("Odd number");
//	}
	//Nested if
		int mark;
		mark=80;
		if(mark>=35) {
			if(mark>=80) {
				System.out.println("Leader");
			}
			else {
				System.out.println("Not eligible for Leader");
			}
		}
		else {
			System.out.println("You Failed");
			System.out.println("Bye");
		}
	
	}

}
