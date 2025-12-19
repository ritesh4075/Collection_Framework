package collections.list.arraylist;
import java.util.ArrayList;

public class ArrayList_Size {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Checking if list is empty
        System.out.println(list.isEmpty());

        list.add(10);
        list.add(20);

        // Getting number of elements
        System.out.println(list.size());
    }
}
