package Default_method;
import java.util.function.Predicate;
public class Predicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate <Integer> p=(no)->no>60;
System.out.println(p.test(65));
Predicate<String> pp=(name)->(name.length()>8);
System.out.println(pp.test("abcdefgh123"));
	}

}
