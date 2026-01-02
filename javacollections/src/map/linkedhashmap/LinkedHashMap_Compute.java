package map.linkedhashmap;
import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMap_Compute {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        // Compute if key absent
        map.computeIfAbsent("A", k -> 10);

        // Compute if key present
        map.computeIfPresent("A", (k, v) -> v + 5);

        // Merge value
        map.merge("A", 5, Integer::sum);

        System.out.println(map);
    }
}
