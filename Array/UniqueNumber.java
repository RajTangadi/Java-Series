
/* program to find unique number in array 
 * input = [1,2,3,4,3,2,1]
 * output = 4
 * Explanation :- except 4 all the number are repeated
 * Note :- this is array manipulation example
*/

import java.util.Scanner;

public class UniqueNumber {
    static int UniqueNumber(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
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
        System.out.println("Unique Element is " + UniqueNumber(arr));
    }
}