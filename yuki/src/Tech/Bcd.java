package Tech;
import java.util.Scanner;
public class Bcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name:");
String name= sc.nextLine();
String [] Fullname = name.split(" ");
String temp=" ";
for(int i=0;i<Fullname.length-1;i++) {
	temp=temp+Fullname[i].charAt(0)+".";

}
temp +=Fullname[Fullname.length-1];
System.out.println(temp);
	}

}
