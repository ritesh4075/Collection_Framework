package map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_LRU {
    public static void main(String[] args) {

        // accessOrder = true enables LRU behavior
        LinkedHashMap<Integer, String> cache = new LinkedHashMap<>(16, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 3;
            }
        };

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");

        cache.get(1); // Access key 1

        cache.put(4, "D"); // Evicts least recently used

        System.out.println(cache);
    }
}
