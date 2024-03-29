package task1;
import java.io.FileOutputStream;
public class File22 {

	public static void main(String[] args) {
	try {
		FileOutputStream fuk=new FileOutputStream("C:\\Users\\Dell\\Documents\\Fileio\\yuki.txt");// TODO Auto-generated method stub
		String a="Welcome to my Kingdom";
		byte b[]=a.getBytes();
		fuk.write(b);
		fuk.close();
		System.out.println("Success...");
	}
catch(Exception e) {
	System.out.println(e);
}
	}

}
