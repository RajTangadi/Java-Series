
/* program to find the second largest Number in th array
 * input = [1,8,3,4,9,2,5]
 * output = 8
 * Explanation :- 8 is second largest number in the given array
 * note :- with help of array manipulation
*/

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {
    static int largerNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int secondLargestNumber(int[] arr) {
        int max = largerNumber(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = largerNumber(arr);
        return secondMax;
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
        System.out.println("Largest Element is " + secondLargestNumber(arr));
    }
}