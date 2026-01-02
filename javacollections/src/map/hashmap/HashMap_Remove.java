package map.hashmap;

import java.util.Map;
import java.util.HashMap;

public class HashMap_Remove {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);

        // Remove entry by key
        map.remove("A");

        System.out.println(map);

        // Remove all entries
        map.clear();

        System.out.println(map);
    }
}

