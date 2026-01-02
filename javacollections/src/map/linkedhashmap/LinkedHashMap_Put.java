package map.linkedhashmap;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMap_Put {
    public static void main(String[] args) {

        // Create LinkedHashMap
        Map<String, Integer> map = new LinkedHashMap<>();

        // Insert entries
        map.put("A", 10);
        map.put("B", 20);

        // Overwrite value
        map.put("A", 50);

        // Insert only if key not present
        map.putIfAbsent("C", 30);

        System.out.println(map);
    }
}
