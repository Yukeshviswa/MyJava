package smartCity;
import java.util.function.*;
@FunctionalInterface
interface Task28{
	int operate(int a,int b);
	
}
public class Ari{
	public static void main(String args[]) {

		Task28 addition=(a,b)->a+b;
		System.out.println("Addition: " +addition.operate(30,50));
		
		Task28 subtraction=(a,b)->a-b;
		System.out.println("Subtraction: "+subtraction.operate(20, 5));
		
		Task28 multiplication=(a,b)->a*b;
		System.out.println("Multiplication: "+multiplication.operate(20, 4));
		
		Task28 division=(a,b)->a/b;
		System.out.println("Division:"+division.operate(40, 2));
		
		
	}
}
	
