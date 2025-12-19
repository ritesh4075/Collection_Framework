package collections.list.arraylist;
import java.util.ArrayList;

public class ArrayList_Search {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        // Checking if element exists
        System.out.println(list.contains(20));

        // Getting first index of element
        System.out.println(list.indexOf(20));

        // Getting last index of element
        System.out.println(list.lastIndexOf(20));
    }
}
