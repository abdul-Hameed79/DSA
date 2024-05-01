/* write a java program to reverse the given array 
 * Time complexity is O(n)
 * Space complexity is O(1)
*/

package Arrays;
import java.util.Scanner;

public class ReverseArray {
    // function to reverse the given array
    public static void reverse(int[] arr) {
        int start = 0, end = arr.length-1;

        while(start < end) {
            // swapping numbers using temp variable
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }

        // print the reversed array
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        /*  Direct method
            int[] arr = {2,6,1,7,9};

            reverse(arr); // function call
        */

        // input taking from user
        Scanner sc = new Scanner(System.in);

        // prompt the user to enter size of array
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        // create an array
        int[] arr = new int[size];

        // Elements before swapping
        System.out.print("Elements before swapping: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        // print the array after swapping
        System.out.print("Elements after swapping: ");
        reverse(arr); // function call
    }
}