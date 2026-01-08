package map.enummap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMap_Search {
    public static void main(String[] args) {

        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.MON, "Work");
        map.put(Day.TUE, "Gym");

        System.out.println(map.containsKey(Day.MON));
        System.out.println(map.containsValue("Gym"));
    }
}
