package map.hashmap;

import java.util.Map;
import java.util.HashMap;

public class HashMap_Get {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);

        // Get value by key
        System.out.println(map.get("A"));

        // Get default value if key not found
        System.out.println(map.getOrDefault("C", -1));
    }
}
