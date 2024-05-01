// write a java proram to print the max subArrays of the given array and print the how many subArrays are present

package Arrays;

public class SubArrays {

    // Function to calculate SubArrays
    public static void printSubArray(int[] arr) {
        int totalSubArrays = 0;  // Initial value
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                for(int k=i; k<=j; k++) {
                    System.out.print(arr[k] + " ");
                }
                totalSubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total subarrays: " + totalSubArrays); // Final value
        
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        printSubArray(arr);
    }
}