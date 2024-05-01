// write a java program to print sum of maximum sub array by using kadane's algorithm
// Time complexity is O(n); space complexity is O(1);

package Arrays;

public class KadanesAlgorithm {
    // Function to find max sub array sum
    public static void maxSubArraySum(int[] arr) {
        int currentsum = arr[0], maxsum = Integer.MIN_VALUE;

        for(int i=1; i<arr.length; i++) {
            currentsum = Math.max(arr[i], currentsum + arr[i]);
            maxsum = Math.max(currentsum, maxsum);
        }
        System.out.println(maxsum);    
    }

    // Main.java
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

    // Function call
    maxSubArraySum(arr);
    }
}