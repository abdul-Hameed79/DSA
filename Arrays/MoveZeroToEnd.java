// Write a java program, Move zeros to an end

package Arrays;
import java.util.Arrays;

public class MoveZeroToEnd {
    public static void moveZerosToEnd(int[] nums) {
        int count = 0; // Count of non-zero elements

        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        // Fill remaining positions with zeros
        while (count < nums.length) {
            nums[count++] = 0;
        }
    }

    // Main.java
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12, 0, 2};

        // Function call
        moveZerosToEnd(nums);
        
        // Display the output
        System.out.println("Array after moving zeros to end: " + Arrays.toString(nums));    // Output: 1, 3, 12, 0, 0, 0
    }
}