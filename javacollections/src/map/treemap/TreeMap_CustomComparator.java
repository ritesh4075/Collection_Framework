package map.treemap;

import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;

public class TreeMap_CustomComparator {
    public static void main(String[] args) {

        // Sort keys in descending order
        Map<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println(map);
    }
}
