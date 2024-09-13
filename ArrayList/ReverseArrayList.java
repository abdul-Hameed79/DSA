package ArrayList;
import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(4);
        nums.add(7);
        nums.add(3);
        nums.add(9);

        System.out.println("ArrayList before: " + nums);

        System.out.print("ArrayList after: ");
        //Reverse an array --> O(n)
        for (int i=nums.size()-1; i>=0; i--) {
            System.out.print(nums.get(i) + " ");
        }
    }
}
