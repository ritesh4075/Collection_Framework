package collections.list.arraylist;
import java.util.ArrayList;

public class ArrayList_Capacity {
    public static void main(String[] args) {

        // Creating ArrayList with default capacity
        ArrayList<Integer> list = new ArrayList<>();

        // Ensuring minimum capacity to avoid resizing
        list.ensureCapacity(50);

        list.add(10);
        list.add(20);

        // Trimming unused capacity
        list.trimToSize();

        System.out.println(list);
    }
}
