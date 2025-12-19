package collections.list.arraylist;
import java.util.ArrayList;

public class ArrayList_Bulk {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Removing elements based on condition
        list.removeIf(x -> x % 2 == 0);

        System.out.println(list);

        // Modifying each element
        list.replaceAll(x -> x * 10);

        System.out.println(list);
    }
}
