/* find the pair of triplets the Array whose
   sum is equal to the given target value x

 * Target = 12;
 * input: [1,4,5,6,3]
 * output: (1,5,6) ,(4,5,3) 
 *  Explanation:- there are 2 pair of triplets which added to get target value that is
 *       (1,5,6) ,(4,5,3)         
 */

import java.util.Scanner;

public class TargetSum4 {
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

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j <= size - 1; j++) {
                for (int k = j + 1; k <= size - 1; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == target) {
                        System.out.printf("(%d,%d,%d)", arr[i], arr[j], arr[k]);
                    }
                }

            }
        }

    }

}