// Write a java program to find the target in an array, and print the index where it locates

package Arrays.BinarySearch;

public class Example {
    static int findLargetNum(int[] nums, int target) {
        int start = 0, end = nums.length-1;

        while(start < end) {
            int mid = (start + end) / 2;

            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Main.java
    public static void main(String[] args) {
        int[] arr = {4, 6, 9, 12, 35, 45, 2};
        int target = 12;

        System.out.println("Target found at index: " + findLargetNum(arr, target));
    }
}