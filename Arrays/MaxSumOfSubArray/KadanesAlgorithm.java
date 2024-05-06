package Arrays.MaxSumOfSubArray;

public class KadanesAlgorithm {
    static int findMaxSum(int[] arr) {
        // Initial values of currentsum and maximum sum
        int currSum = arr[0], maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            // Updated current sum
            currSum = Math.max(arr[i], currSum + arr[i]);
            // Updated maximum sum
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2, -4, -5, -1, 0, -6};

        // Function call
        int maxSum = findMaxSum(arr);

        // Display the maximum sum of subarray
        System.out.println("Max sum of sub array is: " + maxSum); 
    }
}