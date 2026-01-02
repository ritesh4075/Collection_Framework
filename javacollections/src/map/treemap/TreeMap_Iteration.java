package map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Iteration {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        // Iterate in sorted key order
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
