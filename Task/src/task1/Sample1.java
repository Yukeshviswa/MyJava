package task1;

import java.io.*;

public class Sample1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
FileInputStream input1=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Raja\\src\\Demo13.txt");
FileInputStream input2=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\yuki\\src\\yuki.txt");
FileOutputStream fot=new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\yuki\\src\\Ram.txt");
SequenceInputStream pip=new SequenceInputStream(input1,input2);
int i;
while((i=pip.read())!=-1){
	fot.write(i);
}
pip.close();
fot.close();
input1.close();
input2.close();
System.out.println("Success...");
	}

}
