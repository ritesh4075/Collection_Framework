package map.hashmap;
import java.util.Map;
import java.util.HashMap;

public class HashMap_Iteration {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);

        // Iterate keys
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Iterate values
        for (int val : map.values()) {
            System.out.println(val);
        }

        // Iterate entries
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}

