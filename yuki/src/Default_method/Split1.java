package Default_method;

public class Split1{
	public static void main(String[]args) {
String s = "a4b3c2d1";
int sum = 0;
String num = "";{

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

if (!num.isEmpty()) {
    sum += Integer.parseInt(num);
}
}
System.out.println("The sum is: " + sum); // Output: The sum is: 10
}
}