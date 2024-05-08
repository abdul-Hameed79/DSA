// Write a java program to find the largest Number in an array

package Arrays.LinearSearch;

public class Example_2 {
  static int findLargest(int[] arr) {
    int LarNum = arr[0];        // initial Largest Num
    for(int i=1; i<arr.length; i++) {
        if(LarNum < arr[i]) {
            LarNum = arr[i];    // updted Largest Num
        }
    }
    return LarNum;
  }

  // Main.java
  public static void main(String[] args) {
    int[] arr = {3, 2, 6, 9, 1};

    System.out.println("Largest element in the array is: " + findLargest(arr));
  }
}