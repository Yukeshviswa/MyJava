package sample1;

public class Double {
public static void main(String []args) {
//	int a[]= {1,2,3,4,5,6};
//	for(int value:a) {
//		System.out.print(value+" ");
//	}
		int b[][]={ 
			{7,8,9},
			{9,8,7},
			{1,2,3}
		};
		for(int temp[]:b) {
			for(int value:temp) {
		
			System.out.println(value+" ");
			}
			System.out.println();
			
}
}
}