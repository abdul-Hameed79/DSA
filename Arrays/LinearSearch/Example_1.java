/*  Write a java program to find the target in an array 
    and print the index where it locates, by using linear search method   */

package Arrays.LinearSearch;

public class Example_1 {
    static int findTarget(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Main.java
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 9, 5, 2};
        int target = 9;

        System.out.println(findTarget(arr, target));   // Output: 3
    }
}