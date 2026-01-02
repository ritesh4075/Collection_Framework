package map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Remove {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "A");
        map.put(2, "B");

        // Remove entry
        map.remove(1);

        System.out.println(map);

        // Clear map
        map.clear();

        System.out.println(map);
    }
}
