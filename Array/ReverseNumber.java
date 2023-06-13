/* program to find reverse of an array
 * input = [1,2,3,4,5]
 * output = [5,4,3,2,1]
 */

import java.util.Scanner;

public class ReverseNumber {
    static int[] reverse(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        // traverse original array in reverse direction

        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
        int[] ans = reverse(arr);
        printArray(ans);
    }
}

// second method [in place]

import java.util.Scanner;

public class Sample {

    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
        reverseArray(arr);
        printArray(arr);
    }
}
