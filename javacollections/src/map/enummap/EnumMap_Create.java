package map.enummap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMap_Create {
    public static void main(String[] args) {

        // Create empty EnumMap with enum key type
        Map<Day, String> map = new EnumMap<>(Day.class);

        System.out.println(map);
    }
}
