// write a java progrm to print all possible pairs of an array

package Arrays;

public class PrintPairs {

    // function to calculate pairs in array
    public static void pairs(int[] arr) {
        int totalPairs = 0; // initially i have assumed total pairs is 0
        for(int i=0; i<arr.length; i++) {
            int current = arr[i]; // 1, 2, 3, 4, 5

            for(int j=i+1; j<arr.length; j++) {
                System.out.print("(" + current + "," + arr[j] + ")");
                totalPairs++; // count for total pairs of array incremented
            }

            System.out.println();
        }

        System.out.println("Total no.of possible pairs: " + totalPairs);
    }
    
    // Main.java
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        pairs(arr); // function call
    }
}