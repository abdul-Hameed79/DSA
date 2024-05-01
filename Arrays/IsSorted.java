// Write a java program to print whether an array is sorted or not

package Arrays;

public class IsSorted {
    // Function to Check array is sorted or not
    public static boolean sort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                return false;  // return false if the array 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 8, 9};

        System.out.println(sort(arr));
    }
}