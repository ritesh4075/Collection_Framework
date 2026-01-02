package map.treemap;

import java.util.TreeMap;
import java.util.SortedMap;

public class TreeMap_Range {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, "D");

        SortedMap<Integer, String> sub = map.subMap(20, 40);
        System.out.println(sub);

        System.out.println(map.headMap(30));
        System.out.println(map.tailMap(30));
    }
}

