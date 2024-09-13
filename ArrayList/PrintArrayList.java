// Write a java program to print elements present in an array list

package ArrayList;
import java.util.ArrayList;

public class PrintArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
