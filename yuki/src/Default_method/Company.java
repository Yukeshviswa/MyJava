package Default_method;

public interface Company {

	default void Calculate_Salary(int a,int b) {
		System.out.println(a+b);

	}
	static void test(){
		System.out.println("Contract Interface");
		
	}

	

}
