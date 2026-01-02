package map.hashmap;

import java.util.Map;
import java.util.HashMap;

public class HashMap_Search {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);

        // Check if key exists
        System.out.println(map.containsKey("A"));

        // Check if value exists
        System.out.println(map.containsValue(20));
    }
}

