package task1;
import java.io.*;
public class Sample4 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
FileOutputStream file=new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\Task\\src\\Troll1.txt");
DataOutputStream dot=new DataOutputStream(file);
dot.writeInt(65);
dot.flush();
dot.close();
System.out.println("Success");

	}

}
