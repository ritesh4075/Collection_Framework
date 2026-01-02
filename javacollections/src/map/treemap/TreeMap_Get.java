package map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Get {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "A");
        map.put(2, "B");

        // Get value
        System.out.println(map.get(1));

        // Get default if key missing
        System.out.println(map.getOrDefault(3, "N/A"));
    }
}
