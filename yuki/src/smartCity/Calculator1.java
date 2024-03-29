package smartCity;
import java.util.Scanner;
public class Calculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter  first number:");
int firstNumber=sc.nextInt();
System.out.print("Enter  second number:");
int secondNumber=sc.nextInt();
System.out.print("Enter  operators:('+','-','*','/','%')");
String operation=sc.next();
int result=PerformOperation(firstNumber,secondNumber,operation);
System.out.println("result"+result);
	}

	private static int PerformOperation(int firstNumber, int secondNumber, String operation) {
		// TODO Auto-generated method stub
		int result1 = 0;
		try {
		
        if (operation.equals("+")) {
            result1 = firstNumber + secondNumber;
           
        }
        else if (operation.equals("-")) {
            result1 = firstNumber - secondNumber;
            
        }
        else if (operation.equals("*")) {
            result1 = firstNumber * secondNumber;
            
        }
        else if (operation.equals("%")) {
            result1 = firstNumber % secondNumber;
             
        }
        else if (operation.equals("/")) {
            result1 = firstNumber / secondNumber;
            
        }
        else {
            System.out.println("Invalid operation");
        }
        
	}
	catch(ArithmeticException e) {
		System.out.println("Wrong input");
		System.out.println(e);
	}
		return result1;
	}
}
