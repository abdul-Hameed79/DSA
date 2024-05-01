// Time Complexity --> O(n2);  space complexity --> O(1);

package Arrays;

public class PrefixSum {

    // Function to calculate the max sum of sub array
    public static void maxsubArraySum(int[] arr) {
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;

    // Create a prefix array to store max sum
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                currentsum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(currentsum > maxsum) {
                    maxsum = currentsum;
                }
            }
        }
        System.out.println("Maximum sum of sub array is: " + maxsum);
    }

    // Main.java
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        // Function call
        maxsubArraySum(arr);
    }
}