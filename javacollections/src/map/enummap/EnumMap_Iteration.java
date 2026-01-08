package map.enummap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMap_Iteration {
    public static void main(String[] args) {

        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.WED, "Study");
        map.put(Day.MON, "Work");
        map.put(Day.FRI, "Party");

        // Iterates in enum declaration order
        for (Map.Entry<Day, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
