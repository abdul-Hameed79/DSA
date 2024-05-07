// Write a java program to print maximum sum of an array using brute force algorithm
// Time Complexity => O(n^3)   &&  Space Complexity => O(1)

package Arrays.MaxSumOfSubArray;

public class BruteForce {
    // Function to find max sum of sub array
    static int findMaxSum(int[] arr) {

        // initial value of maxSum
        int maxSum = Integer.MIN_VALUE;
         // initial value of current sum
         int currentSum = 0;

        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                currentSum = 0;
                for(int k=i; k<=j; k++) {
                    currentSum += arr[k];
                }           
            }
            
            maxSum = Math.max(currentSum, maxSum);
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