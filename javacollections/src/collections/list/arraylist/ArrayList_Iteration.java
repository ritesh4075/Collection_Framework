package collections.list.arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iteration {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // Iterating using Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // Iterating using forEach
        list.forEach(x -> System.out.print(x + " "));
    }
}
