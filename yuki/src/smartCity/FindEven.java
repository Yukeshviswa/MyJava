package smartCity;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface evenn{
	void evenNum(List<Integer> AAA);
}
class Mathamatics{
	public void numb(List<Integer> AAA) {
		
		List numbe = AAA.stream()
				.map(s1->s1*s1)
				.filter(f->f%2==0)
				.collect(Collectors.toList());
				System.out.println("Squares of even numbers :"+numbe);
				
		List<Integer> countOfPrimeNumbers = AAA.stream()
				.filter(Mathamatics::isPrime)
				.collect(Collectors.toList());
				
				System.out.println("Count of prime numbers :"+countOfPrimeNumbers);
	}

		    public static boolean isPrime(int n) {
		        if (n<2) {
		            return false;
		        }
		        for (int i=2; i<=Math.sqrt(n); i++) {
		            if (n%i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }
		}
	
public class FindEven {
	public static void main(String []args) {
		List<Integer> ab = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
	
		Mathamatics mat = new Mathamatics();
		evenn en = mat::numb;
		en.evenNum(ab); 
	}
}