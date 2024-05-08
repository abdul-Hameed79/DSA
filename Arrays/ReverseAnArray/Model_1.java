// Write a java program to reverse the given array

package Arrays.ReverseAnArray;

class Model_1 {
    static void Reverse(int[] arr) {
        int start = 0, end = arr.length-1;

        while(start < end) {
            // Swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 7};

        // Function call
        Reverse(arr);

        // Loop to print reversed array
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}