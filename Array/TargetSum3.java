
/* Count the number of triplets whose sum is equal to the given value x

 * Target = 12;
 * input: [1,4,5,6,3]
 * output: 2
 * Explanation:- there are two triplets which added to get target value that is
 * (1,5,6) ,(4,5,3)
 *
*/

import java.util.Scanner;

public class TargetSum3 {
    static int pairSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                for (int k = j + 1; k <= n - 1; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == target) {
                        ans++;
                    }
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " element");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value ");
        int target = sc.nextInt();
        System.out.println(pairSum(arr, target));
    }
}
