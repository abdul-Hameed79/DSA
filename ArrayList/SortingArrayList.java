// write a java program to sort an arraylist

package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(6);

        Collections.sort(list);
        System.out.println(list);
    }
}

// Collections.sort(list, Collections.reverseOrder())  for descending order sorting