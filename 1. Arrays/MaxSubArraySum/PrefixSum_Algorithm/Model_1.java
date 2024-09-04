package Arrays.MaxSubArraySum.PrefixSum_Algorithm;

public class Model_1 {

    // Function to find max sub array sum
    static int MaxSubArraySum(int[] arr) {
        int n = arr.length;

        // Create a prefixsum array
        int[] prefixsum = new int[n];
        prefixsum[0] = arr[0];     
        int maxsum = arr[0];        // initial maxsum

        for(int i=1; i<n; i++) {
            prefixsum[i] = prefixsum[i-1] + arr[i];
            maxsum = Math.max(maxsum, prefixsum[i]);    // updated maxsum
        }

        return maxsum;
    }

    // Main.java
    public static void main(String[] args) {
        int[] marks = {2, 4, 6, 8, 10};

        int maxsum = MaxSubArraySum(marks);     // Function call

        System.out.println("Max sub array sum is: " + maxsum);
    }
}