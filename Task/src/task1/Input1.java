package task1;
import java.io.FileInputStream;
public class Input1 {

	public static void main(String[] args) {
try {
	FileInputStream fot=new FileInputStream("C:\\Users\\Dell\\Documents\\Fileio\\yuki.txt");
	int i=0;
	 while((i=fot.read())!=-1){    
	System.out.print((char)i);
	 }
	fot.close();
}
catch(Exception e) {
	System.out.println(e);
}
	}

}
