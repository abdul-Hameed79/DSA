package Arrays.MaxSubArraySum.Kadanes_Algorithm;

public class Exampe {
    public static int findMaxSubArray(int[] arr) {
        int currentsum = 0, maxSum = Integer.MIN_VALUE;    // initial values

        for(int i=0; i<arr.length; i++) {
            currentsum = Math.max(arr[i], currentsum + arr[i]);   // updated current sum

            maxSum = Math.max(maxSum, currentsum);     // updated max sum
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2, -6, -3, -8, -2, -1};

        int maxSum = findMaxSubArray(nums);     // Function call

        System.out.println("Max sum of sub array is: " + maxSum);   // Display the output
    }        
}