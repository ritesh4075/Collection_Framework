package map.hashmap;

import java.util.Map;
import java.util.HashMap;

public class HashMap_Put {
    public static void main(String[] args) {

        // Create HashMap
        Map<String, Integer> map = new HashMap<>();

        // Insert key-value pairs
        map.put("A", 10);
        map.put("B", 20);

        // Overwrites existing value
        map.put("A", 50);

        // Insert only if key not present
        map.putIfAbsent("C", 30);
        map.putIfAbsent("A", 100);

        System.out.println(map);
    }
}

