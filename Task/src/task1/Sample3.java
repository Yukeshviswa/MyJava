package task1;
import java.io.*;
public class Sample3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
byte put[]= {45,40,48,44};
ByteArrayInputStream dot=new ByteArrayInputStream(put);
int k=0;
while((k=dot.read())!=-1){
	char ch=(char)k;
	System.out.println("ASCII value of character is:" + k + "; Special character is:" + ch);
	
}

	}
}
