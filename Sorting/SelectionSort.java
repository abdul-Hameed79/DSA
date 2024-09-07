package Sorting;

public class SelectionSort {
    // Main.java
    public static void main(String[] args) {
        int[] nums = {4, 6, 3, 2, 9, 7};

        // Function call
        selectionSort(nums);
        System.out.print("sorted array is: ");
        printArray(nums);
    }

    // Function to find selection sort array
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            int minIndex = i;
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[minIndex]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }
    }
    static void printArray(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}