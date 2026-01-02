package map.linkedhashmap;
import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMap_Remove {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
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
