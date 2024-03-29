package task1;
import java.io.FileOutputStream;
public class File11 {

	public static void main(String[] args) {
		try {
			FileOutputStream ppt=new FileOutputStream("C:\\Users\\Dell\\Documents\\Fileio\\Demo2.txt");
			
			ppt.write(82);
			ppt.close();
			System.out.println("Success...");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}
