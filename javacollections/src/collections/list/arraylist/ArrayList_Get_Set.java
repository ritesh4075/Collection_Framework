package collections.list.arraylist;
import java.util.ArrayList;

public class ArrayList_Get_Set {
    public static void main(String[] args) {

        // Creating ArrayList with initial values
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // Accessing element using index
        int value = list.get(1);
        System.out.println(value);

        // Updating element at a specific index
        list.set(1, 99);

        System.out.println(list);
    }
}
