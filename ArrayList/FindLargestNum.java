// write a java program to find larget number in given arraylist
package ArrayList;
import java.util.ArrayList;

public class FindLargestNum {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(2);
        values.add(5);
        values.add(9);
        values.add(3);
        values.add(6);

        int maxNum = 0;
        for(int i=0; i<values.size(); i++) {
            if(maxNum < values.get(i)) {
                maxNum = values.get(i);
            }
        }
        System.out.println("Largest Number in the arraylist is: " + maxNum);
    }
}
// O(n)