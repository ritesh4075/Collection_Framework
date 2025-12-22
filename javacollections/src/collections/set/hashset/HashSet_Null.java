package collections.set.hashset;

import java.util.HashSet;

public class HashSet_Null {
    public static void main(String[] args) {

        // Creating HashSet
        HashSet<Integer> set = new HashSet<>();

        // HashSet allows only one null
        set.add(null);
        set.add(null);

        set.add(10);

        System.out.println(set);
    }
}
