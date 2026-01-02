package map.linkedhashmap;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMap_Iteration {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        // Order Preserved
        map.put("C", 30);
        map.put("A", 10);
        map.put("B", 20);

        // Iterate in insertion order
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}

