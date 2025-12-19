package collections.list.arraylist;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Add {
    public static void main(String[] args) {

        // Creating an empty ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements at the end
        list.add(10);
        list.add(20);
        list.add(30);

        // Adding element at a specific index
        list.add(1, 15);

        // Adding multiple elements at once
        list.addAll(Arrays.asList(40, 50, 60));

        System.out.println(list);
    }
}
