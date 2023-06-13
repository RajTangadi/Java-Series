/*find the total number of pair in the Array whose
sum is equal to the given value x

Target = 20;
input: [18,10,30,15,5,10,2]
output: 3
Explanation:- the pair of (18,2) ,(10,10) and (15,5) which add we get 20 value
            as we get 3 pair so output is 3
 */

import java.util.Scanner;

public class TargetSum {
    static int pairSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if ((arr[i] + arr[j]) == target) {
                    ans++;
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
