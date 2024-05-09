package Arrays.MaxSubArraySum.BruteForce_Algorithm;

public class Interview_Question {
    static int countMaxSubarraySumTarget(int[] arr, int target) {
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            int currsum = 0;
            for(int j=i; j<arr.length; j++) {
                currsum += arr[j];

                if(currsum == target) {
                    count++;
                }
            }
        }

        return count;
    }

    // Main.java
    public static void main(String[] args) {
        int[] arr = {2, -7, 3, 4, 8, -3, -4};
        int target = -7;

        int count = countMaxSubarraySumTarget(arr, target);

        System.out.println("Count is: " + count);

    }
}