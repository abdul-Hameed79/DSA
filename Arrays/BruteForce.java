// write a java program to print sum of maxSubArray by using Brute Force method
// Time Complexity is   worst case --> O(n3);   Space compexity is --> O(1)
package Arrays;

public class BruteForce {
    // Function to find Max Value of a sub array
  public static void maxSubArray(int[] arr) {
    int maxSum = Integer.MIN_VALUE;

    for(int i=0; i<arr.length; i++) {
        for(int j=0; j<arr.length; j++) {
          int currentSum = 0;
            for(int k=i; k<=j; k++) {
                currentSum += arr[k];
            }
            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
    }
    System.out.println("Max sum is: " + maxSum);
  }

  // Main.java
  public static void main(String[] args) {
    int[] arr = {2, 4, 6, 8, 10};

    // Function call
    maxSubArray(arr);
  }
}