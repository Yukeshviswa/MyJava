package task1;
import java.io.*;
public class Sample2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
FileOutputStream data1=new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\Task\\src\\Troll1.txt");
FileOutputStream data2=new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\Task\\src\\Troll2.txt");
ByteArrayOutputStream bot=new ByteArrayOutputStream();
bot.write(75);
bot.writeTo(data1);
bot.writeTo(data2);
bot.flush();
bot.close();
System.out.println("Success...");
	}

}
