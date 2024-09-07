package Sorting;

public class BubbleSort {
    // Main.java
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 2, 9, 7};

        // Function call
        bubbleSort(arr);
        System.out.print("Sorted array is: ");
        printArray(arr);
    }

    // Function to find bubble sort 
    static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}