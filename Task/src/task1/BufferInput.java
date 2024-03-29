package task1;

import java.io.*;

public class BufferInput {

	public static void main(String[] args) {
try {
	FileInputStream fot=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Raja\\src\\Demo13.txt");// TODO Auto-generated method stub
BufferedInputStream pot=new BufferedInputStream(fot);
int i;
while((i=pot.read())!=-1) {
	System.out.print((char)i);
}
pot.close();
fot.close();
}
catch(Exception e) {System.out.println(e);
}
}

	}
