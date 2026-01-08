package map.enummap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMap_State {
    public static void main(String[] args) {

        Map<Day, String> map = new EnumMap<>(Day.class);

        System.out.println(map.isEmpty());

        map.put(Day.MON, "Work");
        map.put(Day.TUE, "Gym");

        System.out.println(map.size());
    }
}
