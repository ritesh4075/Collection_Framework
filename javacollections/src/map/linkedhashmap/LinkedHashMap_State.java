package map.linkedhashmap;
import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMap_State {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        System.out.println(map.isEmpty());

        map.put("A", 10);
        map.put("B", 20);

        System.out.println(map.size());
    }
}
