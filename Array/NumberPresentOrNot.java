// check if number is present or not

import java.util.Scanner;

public class NumberPresentOrNot {

    static boolean presentOrNotArray(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number to be find ");
        int k = sc.nextInt();
        System.out.println(presentOrNotArray(arr, k));
    }
}
