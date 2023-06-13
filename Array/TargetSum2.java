/* find the pair of the Array whose
sum is equal to the given target value x

Target = 20;
input: [18,10,30,15,5,10,2]
output: (18,2) ,(10,10) and (15,5)
Explanation:- there are three pair of which added to get target value that is
          (18,2) ,(10,10) and (15,5)

*/

public class TargetSum2 {
    public static void main(String[] args) {
        int[] arr = { 18, 10, 30, 15, 5, 13, 2 };
        int target = 15;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if ((arr[i] + arr[j]) == target) {
                    System.out.printf("(%d,%d)", arr[i], arr[j]);
                }
            }
        }
    }
}
