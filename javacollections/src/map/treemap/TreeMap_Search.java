package map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Search {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "A");
        map.put(2, "B");

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("B"));
    }
}
