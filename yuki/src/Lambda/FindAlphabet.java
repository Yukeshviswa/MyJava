package Lambda;
//import java.util.Map;
public class FindAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="a4b3c2d1";
//String s = "a4b3c2d1";

for (int i = 0; i < s.length(); i += 2) {
    int count = Character.getNumericValue(s.charAt(i + 1));
    while (count-- > 0) {
        System.out.print(s.charAt(i));
    }
}		
String s1 = "a4b3c2d1";
int sum = 0;
String num = "";

for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    if (Character.isDigit(c)) {
        num += c;
    } else {
        if (!num.isEmpty()) {
            sum += Integer.parseInt(num);
            num = "";
        }
    }
}

// Add the last number to the sum
if (!num.isEmpty()) {
    sum += Integer.parseInt(num);
}

System.out.println("    The sum is: " + sum); // Output: The sum is: 10
}
}