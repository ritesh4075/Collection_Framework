package map.linkedhashmap;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMap_Get {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 10);
        map.put("B", 20);

        // Get value by key
        System.out.println(map.get("A"));

        // Get default value if key missing
        System.out.println(map.getOrDefault("C", -1));
    }
}
