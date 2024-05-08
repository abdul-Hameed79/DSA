/* Write a java program to print max sum of subarray using Brute Force algorithm
    Time Complexity => O(n^2)    Space Complexity => O(1)
 */
package Arrays.MaxSubArraySum.BruteForce_Algorithm;

public class Example_1 {
    public static int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;     // initial value 

        for(int i=0; i<n; i++) {
            int sum = 0;
            for(int j=i; j<n; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);     // updated value
            }
        }

        return maxSum;
    }

    // Main.java
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int maxSum = maxSubarraySum(arr);   // Function call

        System.out.println("Max sum of the subarray is: " + maxSum);
    }
}