package smartCity;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Classs{
	void list();
}
class maths{
	public static int square(int number) {
		return number*number;	
	}
}
public class Squareint {
	public static void main(String []args) {
		List<Integer> l = Arrays.asList(1,5,8,10,9,5,4);
		List<Integer> num = l.stream()
				.map(maths :: square)
				.collect(Collectors.toList());
				System.out.println(num);
	}

}