package map.linkedhashmap;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMap_Replace {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 10);
        map.put("B", 20);

        // Replace value
        map.replace("A", 100);

        // Replace only if old value matches
        map.replace("B", 20, 200);

        System.out.println(map);
    }
}
