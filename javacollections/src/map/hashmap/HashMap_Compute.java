package map.hashmap;

import java.util.Map;
import java.util.HashMap;

public class HashMap_Compute {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        // Compute value if absent
        map.computeIfAbsent("A", k -> 10);

        // Compute value if present
        map.computeIfPresent("A", (k, v) -> v + 5);

        // Merge values
        map.merge("A", 5, Integer::sum);

        System.out.println(map);
    }
}

