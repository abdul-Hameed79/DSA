// Binary Search program to find the target
 //  Time Complexity = O(log n)
 //  Space complexity = O(1)

package Arrays;

public class BinarySearch {
    // function to calculate the target
    public static int getAns(int[] arr, int target) {
        int start = 0, end = arr.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // return -1 for invalid target
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,6,9,11,13,14,65,24,92,46};
        int target = 65;

        System.out.println("Target found at index: " + getAns(arr, target));
    }
}