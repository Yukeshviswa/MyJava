package task1;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class Task {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileInputStream input1=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Raja\\src\\Demo13.txt");
		FileInputStream input2=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\yuki\\src\\yuki.txt");
	SequenceInputStream doc=new SequenceInputStream(input1,input2);
	int j;
	while((j=doc.read())!=-1) {
		System.out.print((char)j);
	
		}
	doc.close();
	input1.close();
		input2.close();
		
}

}
