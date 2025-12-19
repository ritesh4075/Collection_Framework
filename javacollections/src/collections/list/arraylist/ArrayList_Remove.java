package collections.list.arraylist;
import java.util.ArrayList;
public class ArrayList_Remove {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        // Removing element by index
        list.remove(0);

        // Removing first occurrence of a value
        list.remove(Integer.valueOf(20));

        System.out.println(list);

        // Removing all elements
        list.clear();

        System.out.println(list);
    }
}

    
