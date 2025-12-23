package collections.set.treeset;

import java.util.TreeSet;

public class TreeSet_Null {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        // This will throw NullPointerException
        set.add(null);
    }
}
