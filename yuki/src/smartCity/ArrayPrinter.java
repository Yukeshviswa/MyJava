package smartCity;

public class ArrayPrinter {
    public static void main(String[] args) {
        int[] ar = {1, 3, 5, 10, 0, 7, 8, 0, 3};

//        System.out.print("Array: [");
//        for (int i = 0; i < ar.length; i++) {
//            System.out.print(ar[i]);
//            if (i < ar.length - 1) {
//                System.out.print(", ");
//            }
//        }
       // System.out.println("]");

        System.out.print("Odd numbers: [");
        for (int num : ar) {
            if (num % 2 != 0 && num != 0) {
                System.out.print(num + ", ");
            }
        }
       // System.out.println("]");

      //  System.out.print("Even numbers: [");
        for (int num : ar) {
            if (num % 2 == 0 && num != 0) {
                System.out.print(num + ", ");
            }
        }
       // System.out.println("]");

        //System.out.print("Zeros: [");
        for (int num : ar) {
            if (num == 0) {
                System.out.print(num + ", ");
            }
        }
        System.out.println("]");
    }
}
