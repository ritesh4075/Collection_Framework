package map.linkedhashmap;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMap_Search {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 10);
        map.put("B", 20);

        // Check key existence
        System.out.println(map.containsKey("A"));

        // Check value existence
        System.out.println(map.containsValue(20));
    }
}
