package smartCity;

public class Odd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] ar= {1,3,5,10,0,7,8,0,3};


      

        System.out.print(" [");
        for (int num : ar) {
            if (num % 2 != 0 && num != 0) {
                System.out.print(num + ", ");
            }
        }
        //System.out.println("]");

        //System.out.print(" [");
        for (int num : ar) {
            if (num % 2 == 0 && num != 0) {
                System.out.print(num + ", ");
            }
        }
        //System.out.println("]");

        //System.out.print(" [");
        for (int num : ar) {
            if (num == 0) {
                System.out.print(num + ", ");
            }
        }
        System.out.print("]");
    }
}
	
