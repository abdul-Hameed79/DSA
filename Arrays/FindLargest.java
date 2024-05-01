// Given an array of integers, print the largest number present in the array

package Arrays;

public class FindLargest {
    // function to calculate largest num in an array
    static int LargestNum(int[] arr) {

        // initially I'm assuming that maxNum present at arr[0]
        int maxNum = arr[0];
        // loop to find maxNum
        for(int i=0 ; i<arr.length; i++) {
            if( arr[i] > maxNum) {
                // swap
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] marks = {45, 76, 83, 92, 67, 56};
        // function call
        System.out.println("Highest marks are: " + LargestNum(marks)); 
    }
}