/* program to find the largest Number in th array
 * input = [1,8,3,4,9,2,5]
 * output = 9
 * Explanation :- 9 is largest number in the given array
*/

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {
    static int largerNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " number ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Largest Element is " + largerNumber(arr));
    }
}