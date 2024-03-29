package sample1;

import java.util.Arrays;

import java.util.Collections;

public class Arraydemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[] arr= {20,10,110,415,50,67,70,8};//Array in java
//System.out.println("Originar Array:" + Arrays.toString(arr));
//Arrays.sort(arr);
//System.out.println("Assending order:"+Arrays.toString(arr));
Arrays.sort(arr,Collections.reverseOrder());
System.out.println("Desending order:"+Arrays.toString(arr));


//String[] m= {"ram","Akash","Yuki"};
//for(int i=0;i<m.length;i++) {
	//System.out.println(m[i]);	
}
	
}
