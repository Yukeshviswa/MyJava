package Sample;
import java.io.*;
public class Sample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
			        try {  
			            Writer w = new FileWriter("C:\\Users\\Dell\\eclipse-workspace\\yuki\\src\\output.txt");  
			            String content = "I love my country";  
			            w.write(content);  
			            w.close();  
	            System.out.println("Done");  
		        } catch (IOException e) {  
			            e.printStackTrace();  
		        }  
		    }  
		

	}


