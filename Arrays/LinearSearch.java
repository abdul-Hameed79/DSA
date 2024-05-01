/* An array of numbers are given, in this array print the target value 
 * Time Complexity is O(n)
 * Space Complexity is O(1)
*/

package Arrays;

public class LinearSearch {
    // Functiion to find the Linear search
    static int foundTarget(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }

    // Main.java
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,1,9};
        int target = 9;

        int result = foundTarget(arr, target);

        if(result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Target found at index: " + result);
        }
    } 
}