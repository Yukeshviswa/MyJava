package smartCity;
import java.util.function.*;
@FunctionalInterface
interface Demo
{
	void sample();

	static void method() {
		
		
	}
}
@FunctionalInterface
interface Demo1 extends Demo
{
	void sample();
	static void method()
	{
		System.out.println("static method");
	}
	 default int method2()
	{
		return 1000;
	}
}
public class Temo1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //FunctionalInterface
	Demo d=()->System.out.println("demo");
	d.sample();
	Demo.method();
	System.out.println();
	
	//Predicate
	Predicate<Integer> p=a->a>10;
	System.out.println(p.test(2));
	
	//BiPredicate
	BiPredicate<Integer,String> bp=(i,s)->i<s.length();
	System.out.println(bp.test(10,"Sql"));
	System.out.println(bp.test(5, "programing"));

	//Function
	Function<String,String> f=g->g;
	System.out.println(f.apply("java8Features"));
	
	//BiFunction
	BiFunction<String,Integer,String> bf=(s1,i1)->s1+i1;
	System.out.println(bf.apply("javac", 18));
	
	//Consumer
	Consumer<String> c=c1->System.out.println(c1+"Data Analyst");
	c.accept("Data");
	
	//BiConsumer
	BiConsumer<String,Integer> c2=(b3,b4)->System.out.println(b3+" "+b4+" class");
	c2.accept("javac", 18);
	
	//Supplier
	Supplier<String> s2=()->"Hiii";                       
	System.out.println(s2.get());
	
	//UnaryOperator
	UnaryOperator<Integer> u=u1->u1;
	System.out.println(u.apply(550));
	
	//BinaryOperator
	BinaryOperator<String> bo=(j,l)->j.concat(l);
	System.out.println(bo.apply("Control  ", "Statements"));
	
	}
}
