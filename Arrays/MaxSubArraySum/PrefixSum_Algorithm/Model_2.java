package Arrays.MaxSubArraySum.PrefixSum_Algorithm;

public class Model_2 {
    
    // Function to find max sub array sum
    static int MaxSubArraySum(int[] arr) {
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;

        // Create a prefix sum array
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        // Calculate prefix array
        for(int i=1; i<n; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<n; i++) {
            int currsum = 0;
            for(int j=i; j<n; j++) {
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
            }
            
            if(maxsum < currsum) { 
                maxsum = currsum;
            }
        }

        return maxsum;
    }

    // Main.java
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10};

        int maxsum = MaxSubArraySum(nums);

        System.out.println("Max sub array sum is: " + maxsum);
    }
}