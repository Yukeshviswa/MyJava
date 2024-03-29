package Default_method;

public interface Company2 {
	default void Calculate_Salary(int a,int b) {
		System.out.println(a+b);
	}
static void test1() {
	System.out.println("Its a Static and Default method");
}
}
