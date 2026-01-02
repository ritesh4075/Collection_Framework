package map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Put {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();

        // Insert entries
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        // Overwrite value
        map.put(2, "BB");

        // Insert only if key absent
        map.putIfAbsent(4, "D");

        System.out.println(map);
    }
}

