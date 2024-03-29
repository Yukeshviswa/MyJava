package task1;

	import java.io.*;  
	public class BufferOutput{    
	public static void main(String args[])throws Exception{    
	     FileOutputStream fout=new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\Raja\\src\\Demo13.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     String s="Welcome to javaTpoint.";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("success");    
	}    
	}  
