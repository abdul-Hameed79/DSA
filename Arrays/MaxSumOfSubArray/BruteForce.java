// Write a java program to print maximum sum of an array using brute force algorithm
// Time Complexity => O(n^2)   &&  Space Complexity => O(1)

package Arrays.MaxSumOfSubArray;

public class BruteForce {
    // Function to find max sum of sub array
    static int findMaxSum(int[] arr) {
        // initial value of maxSum
        int maxSum = Integer.MIN_VALUE;     
        for(int i=0; i<arr.length; i++) {
            // initial value of current sum
            int currSum = 0;                
            for(int j=i; j<arr.length; j++) {
                // upddated current sum
                currSum += arr[j];           
            }
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;   
    }

    // Main.java
    public static void main(String[] args) {
        int[] nums = {-2, 4, -6, 8, 10};

        // Function calling
        int maxSum = findMaxSum(nums);

        // Display the maximum sum of subarray
        System.out.println("Max sum of sub array is: " + maxSum);
    }
}