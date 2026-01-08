package map.enummap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMap_Put {
    public static void main(String[] args) {

        Map<Day, String> map = new EnumMap<>(Day.class);

        // Insert entries
        map.put(Day.MON, "Work");
        map.put(Day.TUE, "Gym");

        // Overwrite value
        map.put(Day.MON, "Office");

        // Insert only if absent
        map.putIfAbsent(Day.WED, "Study");

        System.out.println(map);
    }
}

