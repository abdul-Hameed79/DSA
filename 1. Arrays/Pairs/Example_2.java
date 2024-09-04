// Write a java program to print the count of how many possible pairs are present in the given array

package Arrays.Pairs;

class Example_2 {
    static int countPairs(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                count++;
            }
        }
        return count;
    }

    // Main.java
    public static void main(String[] args) {
        int[] arr = {3, 5, 3, 2};
        int count = countPairs(arr);

        System.out.println(count);  // Output: 6
    }
}