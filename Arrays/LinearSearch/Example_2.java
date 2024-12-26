// Write a java program to find the largest Number in an array

package Arrays.LinearSearch;

public class Example_2 {
  static void findLargest(int[] arr) {
    int LarNum = arr[0];        // initial Largest Num
    for(int i=1; i<arr.length; i++) {
        if(LarNum < arr[i]) {
            LarNum = arr[i];    // updted Largest Num
        }
    }
    System.out.println(LarNum);
  }

  // Main.java
  public static void main(String[] args) {
    int[] arr = {3, 2, 6, 9, 1};
    findLargest(arr);
  }
}