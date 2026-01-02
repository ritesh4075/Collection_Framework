package map.hashmap;
import java.util.Map;
import java.util.HashMap;

public class HashMap_State {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        System.out.println(map.isEmpty());

        map.put("A", 10);
        map.put("B", 20);

        System.out.println(map.size());
    }
}

