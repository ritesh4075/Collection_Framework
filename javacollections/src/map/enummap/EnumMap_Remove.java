package map.enummap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMap_Remove {
    public static void main(String[] args) {

        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.MON, "Work");
        map.put(Day.TUE, "Gym");

        // Remove entry
        map.remove(Day.MON);

        System.out.println(map);

        // Clear all entries
        map.clear();

        System.out.println(map);
    }
}
