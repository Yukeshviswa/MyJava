package Default_method;

public class Employee1 implements Company, Company2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Company emp=new Employee1();
emp.Calculate_Salary(1000,200);
Company.test();
Company2.test1();
}                                        //Default method

	@Override
	public void Calculate_Salary(int a, int b) {
		// TODO Auto-generated method stub
		Company2.super.Calculate_Salary(a, b);
		Company.super.Calculate_Salary(a, b);
	}
	
}