// Write a java program to print maximum sum of an array using brute force algorithm

package Arrays.MaxSumOfSubArray;

public class BruteForce {
    // Function to find max sum of sub array
    static void findMaxSum(int[] arr) {
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
        System.out.println("max sum of subarray is: " + maxSum);
    }

    // Main.java
    public static void main(String[] args) {
        int[] nums = {-2, 4, -6, 8, 10};

        // Function calling
        findMaxSum(nums);
    }
}