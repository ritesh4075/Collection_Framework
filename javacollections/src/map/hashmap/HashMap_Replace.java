package map.hashmap;

import java.util.Map;
import java.util.HashMap;

public class HashMap_Replace {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);

        // Replace value
        map.replace("A", 100);

        // Replace only if matches old value
        map.replace("B", 20, 200);

        System.out.println(map);
    }
}

