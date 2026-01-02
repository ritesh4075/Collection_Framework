package map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_State {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();

        System.out.println(map.isEmpty());

        map.put(1, "A");
        map.put(2, "B");

        System.out.println(map.size());
    }
}

