// Write a java program to print the all possible pairs in an array

package Arrays.Pairs;

public class Example_1 {
    static void findPairs(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int current = arr[i];
            for(int j=i+1; j<arr.length; j++) {
                System.out.print("(" + current + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    // Main.java
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10};

        findPairs(nums);
    }
}