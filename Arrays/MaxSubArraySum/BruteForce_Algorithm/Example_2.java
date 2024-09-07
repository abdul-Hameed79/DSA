/* Write a java program to print the max sub array sum using Brute force algorithm
 *  Time Comlexity => O(n^3)   Space Complexity => O(1)
 */
package Arrays.MaxSubArraySum.BruteForce_Algorithm;
import java.util.Scanner;

class Example_2 {
    // Function to find max sum of sub array
    static int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;     // initial value

        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                int currsum = 0;
                for(int k=i; k<=j; k++) {
                    currsum += arr[k]; 
                }
                
                if(currsum > maxSum) {
                    maxSum = currsum;       // updated value
                }
            }
        }

        return maxSum;
    }

    // Main.java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");

        int size = sc.nextInt();

        int[] arr = new int[size];  // Creare an array

        System.out.print("Enter numbers: " + " ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = maxSubarraySum(arr);   // Function call

        System.out.println("Max sum of sub array is: " + maxSum);
        sc.close();
    }
}