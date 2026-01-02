package map.treemap;

import java.util.TreeMap;

public class TreeMap_Navigation {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, "D");

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.ceilingKey(25));
        System.out.println(map.floorKey(25));
        System.out.println(map.higherKey(20));
        System.out.println(map.lowerKey(20));
    }
}
