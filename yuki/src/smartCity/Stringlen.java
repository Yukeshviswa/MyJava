package smartCity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface met{
	void len();
}
class listt{
	void methods(){
		List<String> yuk = Arrays.asList("Jaguar","Airoplane","Intercity","Dell","Apache");
		Comparator<String> len = Comparator.comparing(String :: length);
		yuk.sort(len);
		System.out.println(yuk);
	}
}

public class Stringlen {
	public static void main(String []args) {
		listt L1 = new listt();
		met R2 = L1::methods;
		R2.len();
		
		
	}
}