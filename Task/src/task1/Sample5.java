package task1;
import java.io.*;
public class Sample5 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
//File data=new File("C:\\Users\\Dell\\eclipse-workspace\\Raja\\src\\Con1.txt");
//FileOutputStream tat=new FileOutputStream(data);
//FilterOutputStream tot=new FilterOutputStream(tat);
//String s="Welcome to Uniq Tech";
//byte b[]=s.getBytes();
//tot.write(b);
//tot.flush();
//tot.close();
//tat.close();
//System.out.println("Success...");
		File data=new File("C:\\Users\\Dell\\eclipse-workspace\\Raja\\src\\Con1.txt");
		FileInputStream pop=new FileInputStream(data);
		FilterInputStream pet=new BufferedInputStream(pop);
		int k=0;
		while((k=pet.read())!=-1)
				{
			System.out.print((char)k);
			
				}
		pop.close();
		pet.close();
	}
	

}
