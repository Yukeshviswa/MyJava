package smartCity;

abstract class Tsak29 {

	
	    abstract void calculate(double a, double b);
}
class add extends Task29{
 void calculate(double a, double b) {
	
		double c=a+b;
		System.out.println("Add:"+c);
		
}
}
	class sub extends add{
	@Override
		void calculate(double a,double b) {
			double c=a-b;
			System.out.println("Sub:"+c);
			super.calculate(11.9, 11.2);
		}
	}

	class mul extends sub{
		@Override
		void calculate(double a,double b) {
			double c=a*b;
			System.out.println("Mul:"+c);
			super.calculate(11.9, 11.2);
		}
	}
		class div extends mul{
			@Override
			void calculate(double a,double b) {
				double c=a/b;
				System.out.println("Div:"+c);
				super.calculate(11.9, 11.2);
			}
	
	}	
	
 public class Abscal extends div{

	public static void main(String args[]) {
		Abscal obj=new Abscal();
		obj.calculate(11.9, 11.2);

	}
	
	
	
}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
