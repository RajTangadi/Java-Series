/* for an array of integer return the first value that is repeating in the array 
 * input = [1,5,3,4,6,3,4]
 * output = 3
 * Explanation :- There are 2 repeated value in the array. 
           that are 3 and 4 but 3 is first repeated value so we consider 3
*/

//  first method

import java.util.Scanner;

public class FirstRepeatingNumber {

    static int firstRepeatingNumber(int[] arr){
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    ans = arr[i];
                   break;
                }
            }
            if(ans > -1){
                break;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("please Enter " + size + " array element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("first repeated number is " + firstRepeatingNumber(arr));
    }
}



// second method

import java.util.Scanner;

public class FirstRepeatingNumber {

    static int firstRepeatingNumber(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                 return arr[i];
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("please Enter " + size + " array element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("first repeated number is " + firstRepeatingNumber(arr));
    }
}
