package map.treemap;

import java.util.TreeMap;

public class TreeMap_Null {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        // This throws NullPointerException
        map.put(null, "X");
    }
}

