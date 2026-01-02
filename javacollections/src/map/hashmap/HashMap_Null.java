package map.hashmap;

import java.util.HashMap;

public class HashMap_Null {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // HashMap allows one null key and multiple null values
        map.put(null, 10);
        map.put("A", null);
        // if another null key appear then the key get overwrite
        map.put(null,50);

        System.out.println(map);
    }
}

