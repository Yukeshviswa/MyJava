package sample2{
import java.util.*;	

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the target element to find its index:");
        int target = scanner.nextInt();

        int index = findIndex(array, target);

        if (index != -1) {
            System.out.println("The index of the target element is: " + index);
        } else {
            System.out.println("The target element is not present in the array.");
        }
    }

    public static int findIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}